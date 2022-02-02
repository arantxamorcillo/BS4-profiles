package com.BS4.Perfiles;


import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @ConfigurationPropertiesScan
public class controller {
    @Value("${url}")
    String url;
    @Value("${password}")
    String password;

    @GetMapping("/parameters")
    public String getParameters(){
        return "url: "+url+" password: "+ password;
    }
}
