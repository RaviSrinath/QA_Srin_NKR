package com.runner;

public class ReadExcelData {
	   public static void ReadExcelData () {
	    	 
	    	 public static youtubeTest() {
					
		LaunchingBrowser("Chrome");
		LaunchUrl("https://www.youtube.com/");
		


		
		try {
			File file = new File("C:\\Users\\srina\\Downloads\\DataDriven_JAN.xlsx");
			Workbook book = new XSSFWorkbook(file);
			Sheet sheet = book.getSheet("Sheet1");
			
				Row row = sheet.getRow(1);
					Cell cell = row.getCell(0);
					DataFormatter dataFormat = new DataFormatter();
					String data = dataFormat.formatCellValue(cell);
					System.out.println(data);
					
					webElement search = driver.findElement(By.xpath("//*[@role='comobox'"));
					search.sendKeys(data);
					
					takeScreenshot();
							
				 
			}
		 catch (Exception e) {
			e.printStackTrace();
		}
	    	 }
	   
	}
}
