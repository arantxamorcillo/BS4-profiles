package com.BS4.Perfiles;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Profile1")
public class Profile1 implements Profiles {

    private static final String PROFILE1 = "THIS IS PROFILE ONE";


    String profile =  "profile1";

    @Override
    public String getProfile() {
        return profile;
    }

    @Override
    public void mifunction(){
        System.out.println("1");
    }

}

