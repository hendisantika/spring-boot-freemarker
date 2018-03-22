package com.hendisantika.springbootfreemarker.controller;

import com.hendisantika.springbootfreemarker.domain.City;
import com.hendisantika.springbootfreemarker.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-freemarker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/18
 * Time: 06.03
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping("/showCities")
    public ModelAndView showCities() {

        List<City> cities = cityService.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("cities", cities);

        return new ModelAndView("showCities", params);
    }
}
