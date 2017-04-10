package com.wp.socket.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * Created by zhang on 2017/3/30.
 */
@Configuration
@EnableWebSocket
@EnableWebMvc
public class WebSocketConfig extends WebMvcConfigurerAdapter
   implements WebMvcConfigurer{

}
