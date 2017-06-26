package com.joins.controllers;

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

    @RequestMapping("/hi")
    public ResponseEntity<Object> hi() {
        Map result = new HashMap();
        result.put("message", "hi");
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }
}
