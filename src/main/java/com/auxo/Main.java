package com.auxo;

import com.auxo.resource.UploadFile;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class Main extends Application<Configuration> {
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
    }

    public void run(Configuration configuration, io.dropwizard.setup.Environment environment) throws Exception {
        environment.jersey().register(UploadFile.class);
    }
}
