package com.BS4.Perfiles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController @ConfigurationPropertiesScan
public class MyController {

    @Value("${url}")
    String url;
    @Value("${password}")
    String password;

    @Autowired
    configuration config;

    @Autowired
    Profiles profiles;

    @GetMapping("/parameters")
    public String getParameters(){
        return "url: "+url+" password: "+ password;
    }

    @GetMapping("/miconfig")
    public String getValues(){
        String var1 = config.getVar1();
        String var2 = config.getVar2();

        return var1 + " "+ var2;
    }

    @GetMapping("/profile")
    public Profiles getProfile(){
       return profiles;
    }

}
