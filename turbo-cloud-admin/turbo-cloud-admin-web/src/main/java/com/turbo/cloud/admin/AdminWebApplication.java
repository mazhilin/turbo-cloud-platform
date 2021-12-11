package com.turbo.cloud.admin;

import com.turbo.cloud.framework.core.annotation.SpringBootWebApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <p>封装GreeCloud项目TurboCloudAdminWebApplication类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-12-10 11:26
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@SpringBootWebApplication
public class AdminWebApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(AdminWebApplication.class, args);
        applicationContext.registerShutdownHook();
        applicationContext.start();
    }
}
