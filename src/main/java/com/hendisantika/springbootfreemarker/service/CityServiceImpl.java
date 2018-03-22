package com.hendisantika.springbootfreemarker.service;

import com.hendisantika.springbootfreemarker.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-freemarker
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 23/03/18
 * Time: 06.01
 * To change this template use File | Settings | File Templates.
 */

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private JdbcTemplate jtm;

    @Override
    public List<City> findAll() {

        String sql = "SELECT * FROM CITIES";

        List<City> cities = jtm.query(sql, new BeanPropertyRowMapper(City.class));

        return cities;
    }
}
