package com.wp.utils.Tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * TilesConfigurer 负责定位和加载Tiles定义并协调生成Tiles
 * TilesViewResolver 将逻辑视图名称解析为Tiles定义
 * TODO:需要仔细研究
 * Created by zhang on 2017/4/5.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.wp.utils.Tiles")
public class Tiles3Config extends WebMvcConfigurerAdapter{

    /**
     * Configure TilesConfigurer
     * @return
     */
    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tiles=new TilesConfigurer();
        tiles.setDefinitions(new String[]{"/WEB-INF/views/**/tiles.xml"});
        tiles.setCheckRefresh(true);
        return tiles;
    }


//    @Bean
//    public ViewResolver viewResolver(){
//        return new TilesViewResolver();
//    }

    /**
     * Configure ViewResolvers to deliver preferred views
     * @return
     */
    @Override
    public void configureViewResolvers(ViewResolverRegistry resolverRegistry){
        TilesViewResolver viewResolver=new TilesViewResolver();
        resolverRegistry.viewResolver(viewResolver);
    }

    /**
     * configure ResourceHandlers to serve resources like css / javascript
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static/**").addResourceLocations("/static");
    }



}
