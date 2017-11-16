package com.chinaredstar.jc.crawler.proxy.common.util;

import com.chinaredstar.jc.infras.utils.json.JsonUtil;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by fangjian on 2017/9/25.
 * <p/>
 * 业务公共方法
 */
public class BusinessUtil {

    //微信获取用户详情地址
    private static final String crawler_USER_DETAIL = "https://qyapi.weixin.qq.com/cgi-bin/user/get";

    public static final String DEFAULT_PRINCIPAL_SESSION_KEY = "uc.user.principal";






    /**
     * 获取用户id
     *
     * @return
     */
    public static String getUserInfo() {
        HttpServletRequest request = getHttpServletRequest();
        Principal principal = request.getUserPrincipal();
        if (principal == null) {
            return null;
        }
        return principal.getName();
    }



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
