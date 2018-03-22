package com.hendisantika.springbootfreemarker.service;

import com.hendisantika.springbootfreemarker.domain.City;

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
public interface CityService {
    List<City> findAll();
}
