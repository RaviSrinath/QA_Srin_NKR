package com.Utility;


import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelData {

    static WebDriver driver;

    public static void youtubeTest() {

        // Launch the browser
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Navigate to YouTube
        driver.get("https://www.youtube.com/");

        try {
            File file = new File("C:\\Users\\srina\\Downloads\\DataDriven_JAN.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");

            Row row = sheet.getRow(1);
            Cell cell = row.getCell(0);
            DataFormatter dataFormat = new DataFormatter();
            String data = dataFormat.formatCellValue(cell);
            System.out.println("Data from Excel: " + data);

            // Find the search box and enter the data
            WebElement search = driver.findElement(By.xpath("//*[@id='search']"));
            search.sendKeys(data);

            // Optional: You can submit the search
            search.submit();

            // Take screenshot - your own method should be implemented
            takeScreenshot();

            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot() {
        // Implement screenshot functionality here
        System.out.println("Screenshot taken (placeholder).");
    }

    public static void main(String[] args) {
        youtubeTest();
    }
}
