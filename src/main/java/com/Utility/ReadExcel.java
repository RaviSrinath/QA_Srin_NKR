package com.Utility;


import java.io.File;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

    static WebDriver driver;

    public static void youtubeTest() {

        // Launch the Chrome browser
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Open YouTube
        driver.get("https://www.youtube.com/");

        try {
            // Read Excel file
            File file = new File("C:\\Users\\srina\\Downloads\\DataDriven_JAN.xlsx");
            Workbook book = new XSSFWorkbook(file);
            Sheet sheet = book.getSheet("Sheet1");

            // Read value from first row, first column
            Row row = sheet.getRow(1);
            Cell cell = row.getCell(0);
            DataFormatter dataFormat = new DataFormatter();
            String data = dataFormat.formatCellValue(cell);
            System.out.println("Excel Data: " + data);

            // Find YouTube search box and input Excel data
            WebElement search = driver.findElement(By.xpath("//*[@id='search']"));
            search.sendKeys(data);
            search.sendKeys(Keys.ENTER); // Or search.submit();

            takeScreenshot();

            book.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenshot() {
        // Placeholder for screenshot logic
        System.out.println("Screenshot captured (you can implement this).");
    }

    public static void main(String[] args) {
        youtubeTest();
    }
}
