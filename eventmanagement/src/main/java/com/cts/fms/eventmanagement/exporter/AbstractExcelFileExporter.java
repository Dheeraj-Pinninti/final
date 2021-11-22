package com.cts.fms.eventmanagement.exporter;

import com.cts.fms.eventmanagement.domain.Event;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
/**
 * this is an Abstract Class having File Exporter
 * @author 921661
 *
 */
public abstract class AbstractExcelFileExporter {
/**
 * Constructor serving the class
 * @param eventList
 * @return
 */
    public static ByteArrayInputStream contactListToExcelFile(final List<Event> eventList) {
        try(Workbook workbook = new XSSFWorkbook()){
            final Sheet sheet = workbook.createSheet("Events");

            final Row row = sheet.createRow(0);
            final CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
            headerCellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            // Creating header
            Cell cell = row.createCell(0);
            cell.setCellValue("Event ID");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(1);
            cell.setCellValue("Name");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(2);
            cell.setCellValue("Status");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(3);
            cell.setCellValue("Venue Address");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(4);
            cell.setCellValue("Total Volunteers");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(5);
            cell.setCellValue("Total Volunteer Hours");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(6);
            cell.setCellValue("Total Travel Hours");
            cell.setCellStyle(headerCellStyle);

            cell = row.createCell(7);
            cell.setCellValue("POC");
            cell.setCellStyle(headerCellStyle);
            
         

            // Creating data rows for each customer
            for(int i = 0; i < eventList.size(); i++) {
                Row dataRow = sheet.createRow(i + 1);
                dataRow.createCell(0).setCellValue(eventList.get(i).getEventId());
                dataRow.createCell(1).setCellValue(eventList.get(i).getName());
                dataRow.createCell(2).setCellValue(eventList.get(i).getStatus());
                dataRow.createCell(3).setCellValue(eventList.get(i).getVenueAddress());
                dataRow.createCell(4).setCellValue(eventList.get(i).getTotalVolunteer());
                dataRow.createCell(5).setCellValue(eventList.get(i).getTotalVolunteerHour());
                dataRow.createCell(6).setCellValue(eventList.get(i).getTotalTravelHour());
                dataRow.createCell(7).setCellValue(eventList.get(i).getPoc().getUsername());
            }

            // Making size of column auto resize to fit with data
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            //workbook.write(outputStream);
            return new ByteArrayInputStream(outputStream.toByteArray());
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
        return null;
    }

	
}
