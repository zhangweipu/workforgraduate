package com.wp.utils;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Map;

/**
 * Created by zhang on 2017/2/24.
 */
public class ExportExcel {
    public static void export(String templetPath, String filename, Map<String, Object> map,
                              HttpServletResponse resp) {
        XLSTransformer transformer = new XLSTransformer();
        InputStream in = null;
        OutputStream out = null;
        resp.setHeader("Content-Disposition", "attachment;filename="+filename);
        resp.setContentType("application/vnd.ms-excel");
        try {
            in=new BufferedInputStream(new FileInputStream(templetPath));
            Workbook workbook=transformer.transformXLS(in, map);
            out=resp.getOutputStream();
            //将内容写入输出流并把缓存的内容全部发出去
            workbook.write(out);
            out.flush();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){try {in.close();} catch (IOException e) {}}
            if (out!=null){try {out.close();} catch (IOException e) {}}
        }
    }
}
