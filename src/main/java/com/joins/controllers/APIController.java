package com.joins.controllers;

import com.joins.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joins on 2017. 6. 27..
 */
@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    UserMapper mapper;

    @RequestMapping("/hi")
    public ResponseEntity<Object> hi() throws Exception {
        Map result = new HashMap();
        result.put("message", "hi");
        result.put("saved_time", mapper.select());

        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }
}
