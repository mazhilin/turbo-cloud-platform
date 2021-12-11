package com.turbo.cloud.passport;

import com.turbo.cloud.framework.core.annotation.SpringBootWebApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>封装GreeCloud项目PassportWebApplication类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-12-12 04:03
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@SpringBootWebApplication
public class PassportWebApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(PassportWebApplication.class, args);
        applicationContext.registerShutdownHook();
        applicationContext.start();
    }
}
