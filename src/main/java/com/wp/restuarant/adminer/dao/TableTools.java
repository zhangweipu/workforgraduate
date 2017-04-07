package com.wp.restuarant.adminer.dao;

import com.wp.restuarant.adminer.entity.Table;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.util.List;

/**
 * Created by admin on 2016/11/27.
 */
public class TableTools {

    static String[] excelHeader={"index","name","imageName","type","price","size"};

    public static HSSFWorkbook export(List<Table> list){
        HSSFWorkbook wb=new HSSFWorkbook();
        HSSFSheet sheet=wb.createSheet();
        HSSFRow row=sheet.createRow(0);

        for(int i=0;i<excelHeader.length;i++){
            HSSFCell cell=row.createCell(i);
            cell.setCellValue(excelHeader[i]);
            sheet.autoSizeColumn(i);
        }
        for(Table t:list){
            row.createCell(0).setCellValue(t.getIndex());
            row.createCell(1).setCellValue(t.getName());
            row.createCell(2).setCellValue(t.getImageName());
            row.createCell(3).setCellValue(t.getType());
            row.createCell(4).setCellValue(t.getPrice());
            row.createCell(5).setCellValue(t.getSize());
        }
        return wb;
    }

}
