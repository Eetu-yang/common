package com.single.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/version")
public class VersionController {

    /**
     * get current version
     * @return
     */
    @GetMapping("/current")
    public String getVersion(){
        return "1.0.0";
    }
}
