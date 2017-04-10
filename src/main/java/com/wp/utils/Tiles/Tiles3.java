package com.wp.utils.Tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;

/**
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
}
