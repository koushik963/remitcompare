/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koushik.remitcompare.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author koushik
 */

@RestController
public class RateController {
    
    @RequestMapping(value="/rate",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getRate(){
        return "Hello";
    }
}
