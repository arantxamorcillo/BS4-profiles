package com.BS4.Perfiles;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Profile2")
public class Profile2 implements Profiles {

    String profile = "profile2";

    @Override
    public String getProfile() {
        return profile;
    }

    @Override
    public void mifunction(){
        System.out.println("2");
    }
}