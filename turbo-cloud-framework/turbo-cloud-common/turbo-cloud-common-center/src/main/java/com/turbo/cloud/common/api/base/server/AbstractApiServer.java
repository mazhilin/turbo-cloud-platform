package com.turbo.cloud.common.api.base.server;

import com.turbo.cloud.common.api.ApiRemoteServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * <p>封装GreeCloud项目AbstractApiServer类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-12-12 02:33
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
public abstract class AbstractApiServer implements ApiRemoteServer, InitializingBean {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
