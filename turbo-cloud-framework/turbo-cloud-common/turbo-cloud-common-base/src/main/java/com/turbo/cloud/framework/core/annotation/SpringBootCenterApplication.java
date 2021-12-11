package com.turbo.cloud.framework.core.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.annotation.*;

/**
 * <p>封装GreeCloud项目SpringBootCenterApplication类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-12-11 02:50
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootApplication
public @interface SpringBootCenterApplication {
}
