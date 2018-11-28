/* Copyright 2018 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package PeppaPig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Auther: qixin
 * @Date: 2018/09/14 16:39
 * 解决跨域请求中出现的问题
 */
@ComponentScan
@Configuration
public class CORSConfig extends WebMvcConfigurerAdapter {
    //重写父类提供的跨域请求处理接口
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //添加映射路径
        registry.addMapping("/**")
                //放行的原始域名
                .allowedOrigins("http://localhost:8080")
                //放行的原始域的请求方法
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                //是否发送cookie
                .allowCredentials(true);
    }
}