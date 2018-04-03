package com.udacity.gradle.builditbigger.backend;

import com.example.Joker;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyJokesEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyJokesBean sayHi(@Named("name") String name) {
        MyJokesBean response = new MyJokesBean();
        response.setData("Hi, " + name);

        return response;
    }

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayJoke")
    public MyJokesBean sayJoke() {
        MyJokesBean response = new MyJokesBean();
        response.setData(new Joker().getJoke());
        return response;
    }

}
