package com.turbo.cloud.common.api.base.server.impl;

import com.turbo.cloud.common.api.base.server.AbstractApiServer;
import org.springframework.beans.factory.InitializingBean;

/**
 * <p>封装GreeCloud项目RemoteApiServer类.<br></p>
 * <p>//TODO.<br></p>
 *
 * @author Powered by marklin 2021-12-12 02:25
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
public abstract class RemoteApiServer extends AbstractApiServer implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        super.afterPropertiesSet();
    }
}
