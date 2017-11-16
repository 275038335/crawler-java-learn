package com.chinaredstar.jc.crawler.common.util;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author lenovo
 * @date 2017/11/15
 */
public class BeanUtil {
    /**
     * 获取bean
     *
     * @param cls
     * @param <T> Created by fangjian on 2017/9/25.
     */
    public static <T> T getBean(Class<T> cls) {
        WebApplicationContext wac = getWebApplicationContext();
        return wac.getBean(cls);
    }

    /**
     * 获取WebApplicationContext
     * Created by fangjian on 2017/9/25.
     *
     * @return
     */
    public static WebApplicationContext getWebApplicationContext() {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(getHttpServletRequest().getServletContext());
    }

    /**
     * 获取Request请求
     *
     * @return
     */
    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
