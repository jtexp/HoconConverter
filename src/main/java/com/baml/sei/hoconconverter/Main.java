package com.baml.sei.hoconconverter;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigRenderOptions;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        String file = "sample/itest.conf";
        if (args.length == 1) {
           file = args[0];
        }


        File myConfigFile = new File(file);
        Config config = ConfigFactory.parseFile(myConfigFile);

        Config conf = ConfigFactory.load(file);

        ConfigRenderOptions renderOpts = ConfigRenderOptions.defaults().setOriginComments(false);
        String writeString= config.root().render(renderOpts);

        System.out.println(writeString);


    }







}