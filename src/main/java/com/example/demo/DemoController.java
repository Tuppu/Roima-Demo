package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    public DemoController() {
    }
    
    @RequestMapping(value = "/demo", method = RequestMethod.POST)
    public String test(@RequestBody String inputPayload) {

        DemoTransformer response = new DemoTransformer();
        String transformedMessage = response.transform(inputPayload);
        
        return transformedMessage;
    } 
}