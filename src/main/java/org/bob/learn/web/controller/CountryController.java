package org.bob.learn.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.bob.learn.dao.model.Country;
import org.bob.learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;


    @GetMapping("/list")
    public List<Country> test() throws SQLException {

        return countryService.list();
    }
}
