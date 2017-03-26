package com.wp.utils;

import com.wp.restuarant.food.entity.Foods;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xssf.usermodel.XSSFCell;
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

    public static List readExcel(InputStream in){
        try {
           // InputStream in=new FileInputStream(file);
            try {
                XSSFWorkbook xssfWorkbook=new XSSFWorkbook(in);
                Foods Foods =null;
                List<Foods> list=new ArrayList<Foods>();
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
                            Foods =new Foods();
                            Foods.setName(String.valueOf(xssfRow.getCell(0)));
                            Foods.setType(String.valueOf(xssfRow.getCell(1)));
                            XSSFCell size=xssfRow.getCell(2);
                            Foods.setSize(1);
                            XSSFCell price=xssfRow.getCell(3);
                            Foods.setPrice(1);
                            Foods.setLa(String.valueOf(xssfRow.getCell(4)));
                            Foods.setImageName(String.valueOf(xssfRow.getCell(5)));
                            Foods.setDetail(String.valueOf(xssfRow.getCell(6)));
                            list.add(Foods);
                        }
                    }

                }
                return list;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
