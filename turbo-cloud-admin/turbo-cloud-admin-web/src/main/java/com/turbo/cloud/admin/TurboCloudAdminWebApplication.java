package com.turbo.cloud.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>封装GreeCloud项目TurboCloudAdminWebApplication类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-12-10 11:26
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TurboCloudAdminWebApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TurboCloudAdminWebApplication.class, args);
        applicationContext.registerShutdownHook();
        applicationContext.start();
    }
}
