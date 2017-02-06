package com.wp.utils;

import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.logging.Logger;

/**
 * Created by zhang on 2017/2/4.
 */
@Repository
public class ImportMenu {
    public void importM(){
        File file=new File("d://menu.doc");
        try {
            InputStreamReader in= new InputStreamReader(new FileInputStream(file));
            BufferedReader reader=new BufferedReader(in);
            String str=null;
            while ((str=reader.readLine())!=null){

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
