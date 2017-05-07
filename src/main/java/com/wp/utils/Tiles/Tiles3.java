package com.wp.utils.Tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * TilesConfigurer 负责定位和加载Tiles定义并协调生成Tiles
 * TilesViewResolver 将逻辑视图名称解析为Tiles定义
 * Created by zhang on 2017/4/5.
 */
public class Tiles3 {
    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tiles=new TilesConfigurer();
        tiles.setDefinitions(new String[]{"/WEB-INF/layout/tiles.xml"});
        tiles.setCheckRefresh(true);
        return tiles;
    }

    @Bean
    public ViewResolver viewResolver(){
        return new TilesViewResolver();
    }
}
