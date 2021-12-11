package com.turbo.cloud.common.web.center.base;

import com.turbo.cloud.common.web.center.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * <p>封装GreeCloud项目AbstractController类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-12-12 01:30
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
public abstract class AbstractController implements Controller {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void afterPropertiesSet() throws Exception {
        Field[] fields = this.getClass().getDeclaredFields();
        try {
            Arrays.stream(fields).parallel().forEachOrdered(field -> {
                field.setAccessible(true);
                Object object = null;
                try {
                    object = field.get(this);
                } catch (IllegalAccessException exception) {
                    exception.printStackTrace();
                }
                Class<?> target = field.getType();
                if (object == null && target.getSimpleName().toLowerCase().contains("service")) {
                    //target = ApplicationContextHolder.getService(cls);
                    try {
                        field.set(this, object);
                    } catch (IllegalAccessException exception) {
                        exception.printStackTrace();
                    }
                }
                field.setAccessible(false);
            });
        } catch (Exception exception) {
            logger.error("", exception);
            // ThreadUtil.sleep(1, 5);
            afterPropertiesSet();
        }
    }
}
