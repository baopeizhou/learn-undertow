package org.bob.learn.service;

import org.bob.learn.dao.model.Country;

import java.util.List;

/**
 * 国家相关服务定义类
 */
public interface CountryService {

    boolean addCountry(Country country);

    List<Country> list();
}
