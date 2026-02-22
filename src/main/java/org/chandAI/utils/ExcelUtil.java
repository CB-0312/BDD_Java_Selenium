package org.chandAI.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelUtil {

    public static void readExcel(String filePath) throws Exception {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            row.forEach(cell -> System.out.print(cell.toString() + " | "));
            System.out.println();
        }
        workbook.close();
    }
}