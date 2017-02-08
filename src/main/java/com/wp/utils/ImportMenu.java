package com.wp.utils;

import com.wp.food.entity.foods;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2017/2/4.
 */
@Configuration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ImportMenu.class)
@PropertySource("classpath:app.properties")
public class ImportMenu {
    @Autowired
    Environment env;
    @Test
    public void importM(){
      String b=  env.getProperty("a");
        System.out.println(b+"sssssssssssssssssssssssssss");
        File file=new File("d://menu.doc");
        try {
          //  InputStreamReader in= new InputStreamReader(new FileInputStream(file));
            FileInputStream in=new FileInputStream(file);
            WordExtractor wd=new WordExtractor(in);
            String a=wd.getText();
            System.out.println(a);
//            BufferedReader reader=new BufferedReader(in);
//            String str=null;
//            while ((str=reader.readLine())!=null){
//
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readExcel(File file){
        try {
            InputStream in=new FileInputStream(file);
            try {
                XSSFWorkbook xssfWorkbook=new XSSFWorkbook(in);
                foods foods=null;
                List<foods> list=new ArrayList<foods>();
                for(int numSheet=0;numSheet<xssfWorkbook.getNumberOfSheets();
                        numSheet++){
                    XSSFSheet xssfSheet=xssfWorkbook.getSheetAt(numSheet);
                    if(xssfSheet==null){
                        continue;
                    }
                    for(int rowNum=1;rowNum<=xssfSheet.getLastRowNum();rowNum++)
                    {
                        XSSFRow xssfRow=xssfSheet.getRow(rowNum);
                        if(xssfRow!=null){
                            foods=new foods();
                            foods.setName(String.valueOf(xssfRow.getCell(0)));
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
