package com.chinaredstar.jc.crawler.filter;


import com.chinaredstar.jc.infras.utils.StringUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 跨域处理
 * 配置请求域名，处理方法，请求头等
 * Created by fangjian on 2016/11/22.
 */
public class WebFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String currentOrigin = request.getHeader("Origin");
        if (StringUtil.isNotEmpty(currentOrigin)) {
            response.setHeader("Access-Control-Allow-Origin", currentOrigin);

        } else {
            response.setHeader("Access-Control-Allow-Origin", "*");
        }
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "x-auth-token,x-requested-with,content-type");
        response.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,PATCH");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
