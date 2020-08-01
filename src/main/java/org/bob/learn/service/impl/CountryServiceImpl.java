package org.bob.learn.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.bob.learn.dao.mapper.CountryMapper;
import org.bob.learn.dao.model.Country;
import org.bob.learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 国家相关服务实现类
 */
@Slf4j
@Service
public class CountryServiceImpl implements CountryService {

    @Resource
    private CountryMapper countryMapper;

    @Override
    public boolean addCountry(Country country) {
        try {
            return countryMapper.insert(country)==1?true:false;
        }catch (Exception e){
            log.error("",e);
            return false;
        }
    }

    @Override
    public List<Country> list() {
        return countryMapper.selectAll();
    }
}
