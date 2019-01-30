///* Copyright 2018 tuhu.cn All right reserved. This software is the
// * confidential and proprietary information of tuhu.cn ("Confidential
// * Information"). You shall not disclose such Confidential Information and shall
// * use it only in accordance with the terms of the license agreement you entered
// * into with Tuhu.cn
// */
//package peppapig.config;
//
//import org.springframework.core.annotation.Order;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @Auther: qixin
// * @Date: 2018/09/21 15:13
// */
//
//@Order(1)
//@WebFilter(filterName = "ajaxFilter",urlPatterns = "/*")
//public class FilterConfig implements Filter {
//    @Override
//    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("----------------------start Filter-----------------------------");
//        HttpServletResponse response = (HttpServletResponse)servletResponse;
//        HttpServletRequest request = (HttpServletRequest)servletRequest;
//        response.setContentType("textml;charset=UTF-8");
//        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");
//        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Max-Age", "0");
//        response.setHeader("Access-Control-Allow-Headers",
//                "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("XDomainRequestAllowed", "1");
//        filterChain.doFilter(servletRequest,servletResponse);
//        System.out.println("----------------------stop Filter-----------------------------");
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}