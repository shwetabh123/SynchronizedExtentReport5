package test.java.com.pulse.Test;
	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import main.java.com.pulse.Page.Author;
import main.java.com.pulse.Page.HomePage;
import main.java.com.pulse.Page.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.LogStatus;

import main.java.generic.BasePage;
import main.java.generic.BaseTest;

import main.java.generic.Excel;
//import mx4j.log.Log;
import main.java.generic.ExtentTestManager;



//@Listeners(generic.RealGuru99TimeReport.class)


	public class ValidLogin2 extends BaseTest{

	
	static int teststepcount=000000;
	
	
	
	 static  Excel eLib = new Excel();
	
	public static String url = eLib.getCellValue(path,"PreCon", 1, 0);
	
	  public static String logfiletimestamp;
	    
		  
	public static	ITestResult result = null;

	
	   @Test
	    public void TC3(Method method) throws Exception {

		   //Inside TC3
		   
		 //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify that  VALID username and VALID password.");

	        ExtentTestManager.getTest().assignCategory("Smoke Testing");
		     
	 
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
	    	

			driver.navigate().to(url);


			 Randomaplphanumber R=new Randomaplphanumber();
			  
		       String imagePath=  R.Random();
				
					String un=Excel.getCellValue(XLPATH,"ValidLogin",3,0);
					String pw=Excel.getCellValue(XLPATH,"ValidLogin",3,1);
					String accnt=Excel.getCellValue(XLPATH,"ValidLogin",3,2);
		
					String cb=Excel.getCellValue(XLPATH,"Author",1,3);
					
					

					LoginPage l=new LoginPage(driver);
					

					
					BasePage b=new BasePage(driver);

					driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "username is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
		
					 
					l.setPassword(pw);
					
					Thread.sleep(5000);
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Password is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			       	
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
					
					l.clickLogin();
					
					Thread.sleep(30000);

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Login is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
					
					l.dropdowntheaccount(accnt);
					Thread.sleep(5000);
				

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "dropdown is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
					l.clickselect();
					Thread.sleep(5000);
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "select is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
		   	        
	    }

	   @Test
	    public void TC4(Method method) throws Exception {
		   
		   
		   
		 //ExtentReports Description
	        ExtentTestManager.getTest().setDescription(" INVALID username and VALID password.");

	        ExtentTestManager.getTest().assignCategory("Regression Testing");
		    
	 
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
	    	

			driver.navigate().to(url);


			 Randomaplphanumber R=new Randomaplphanumber();
			  
		       String imagePath=  R.Random();
				
					String un=Excel.getCellValue(XLPATH,"ValidLogin",4,0);
					String pw=Excel.getCellValue(XLPATH,"ValidLogin",4,1);
					String accnt=Excel.getCellValue(XLPATH,"ValidLogin",4,2);
		
					String cb=Excel.getCellValue(XLPATH,"Author",1,3);
					

					LoginPage l=new LoginPage(driver);
					

					
					BasePage b=new BasePage(driver);

					driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "username is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			       	
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
					 
					l.setPassword(pw);
					
					Thread.sleep(5000);
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Password is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
					
					l.clickLogin();
					
					Thread.sleep(30000);

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Login is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
					
					l.dropdowntheaccount(accnt);
					Thread.sleep(5000);
				

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "dropdown is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
					l.clickselect();
					Thread.sleep(5000);
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "select is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
	   
	   }
	
	
	
	/*
	
	@Test
		public void testValidLogin3() throws Exception
		
		{
		
		
		
		driver.navigate().to(url);

			
			 Randomaplphanumber R=new Randomaplphanumber();
			  
		String r=  R.Random();
			
				String un=Excel.getCellValue(XLPATH,"ValidLogin",3,0);
				String pw=Excel.getCellValue(XLPATH,"ValidLogin",3,1);
				String accnt=Excel.getCellValue(XLPATH,"ValidLogin",3,2);
	
				String cb=Excel.getCellValue(XLPATH,"Author",1,3);
				
				

				

				LoginPage l=new LoginPage(driver);
				

				
				BasePage b=new BasePage(driver);
				

				
				
	//			APP_LOGS.info("type username");
				
				
				//		l.setUserName(un);
						
						
						driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
						
		//				extentTest.log(Status.PASS, "username is Typed ");
						
						
		//				extentTest.log(Status.INFO, "Snapshot below: ");
						
				//        r= BaseTest.getScreenshot(driver, method.getName());
							
							
				//			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
					
						
						
						
						
						
					//	getScreenshot(driver, method.getName());
						

//		        r= BaseTest.getScreenshot(driver, method.getName());

			
	//		APP_LOGS.info("type password");
				 
				 
				l.setPassword(pw);
				
				Thread.sleep(5000);
				
	//			extentTest.log(Status.PASS, "Password is Typed ");
				
				
	//			extentTest.log(Status.INFO, "Snapshot below: ");

//		        r= BaseTest.getScreenshot(driver, method.getName());
					
					

			
	//			APP_LOGS.info("click select");
				
				l.clickLogin();
				
				Thread.sleep(25000);
				
				
			//	extentTest.log(Status.PASS, "Login is clicked");
				
				
	//			extentTest.log(Status.INFO, "Snapshot below: ");
				
				
	

				
				
				l.dropdowntheaccount(accnt);
				Thread.sleep(25000);
	
					

				
				
	
				
		//        r= BaseTest.getScreenshot(driver, method.getName());
					
					
			//		extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
			
				
				
				
				
	//			getScreenshot(driver, method.getName());
				
					
	//		    r= BaseTest.getScreenshot(driver, method.getName());
						

	//			APP_LOGS.info("click select");
				
		
				l.clickselect();
				Thread.sleep(5000);
				
				


			
				HomePage h=new HomePage(driver);
				
			
			
				  driver.close();

					
				   ExtentTestManager.getTest().log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
			        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
			        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
			

//				APP_LOGS.info("click arrrow down");
				
	//			h.Logout();
				
//			APP_LOGS.info("click logout");
		}

	
	@Test
	public void testValidLogin4() throws Exception
	
	{
		
	
	driver.navigate().to(url);


		
	//	driver.get(url);
		
		 Randomaplphanumber R=new Randomaplphanumber();
		  
	String r=  R.Random();
		
			String un=Excel.getCellValue(XLPATH,"ValidLogin",4,0);
			String pw=Excel.getCellValue(XLPATH,"ValidLogin",4,1);
			String accnt=Excel.getCellValue(XLPATH,"ValidLogin",4,2);

			String cb=Excel.getCellValue(XLPATH,"Author",1,3);
			
			
		
	
//	Logger APP_LOGS = Logger.getLogger(ValidLogin2.class);
			

			LoginPage l=new LoginPage(driver);
			

			
			BasePage b=new BasePage(driver);
			

			
			
//			APP_LOGS.info("type username");
			
			
			//		l.setUserName(un);
					
					
					driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
					
	//				extentTest.log(Status.PASS, "username is Typed ");
					
					
		//			extentTest.log(Status.INFO, "Snapshot below: ");
					
		//	        r= BaseTest.getScreenshot(driver, method.getName());
						
						
			//			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
				
					
					
					
					
					
				//	getScreenshot(driver, method.getName());
					

//	        r= BaseTest.getScreenshot(driver, method.getName());

		
//		APP_LOGS.info("type password");
			 
			 
			l.setPassword(pw);
			
			Thread.sleep(5000);
			
		//	extentTest.log(Status.PASS, "Password is Typed ");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");

//	        r= BaseTest.getScreenshot(driver, method.getName());
				
				

		
//			APP_LOGS.info("click select");
			
			l.clickLogin();
			
			Thread.sleep(25000);
			
			
	//		extentTest.log(Status.PASS, "Login is clicked");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");
			
			

			
//	        r= BaseTest.getScreenshot(driver, method.getName());
				

//			APP_LOGS.info("click dropdown ");
			
			
			
			l.dropdowntheaccount(accnt);
			Thread.sleep(5000);

				
	//		extentTest.log(Status.PASS, "dropdown is clicked");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");
			
			

			
	//        r= BaseTest.getScreenshot(driver, method.getName());
				
				
		//		extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(r));
		
			
			
			
			
			
		//	getScreenshot(driver, method.getName());
			
				
//		    r= BaseTest.getScreenshot(driver, method.getName());
					

//			APP_LOGS.info("click select");
			
	
			l.clickselect();
			Thread.sleep(5000);
			
			
	//		extentTest.log(Status.PASS, "Select is clicked");
			
			
	//		extentTest.log(Status.INFO, "Snapshot below: ");
			
//			r = BaseTest.getScreenshot(driver, method.getName());

		
			HomePage h=new HomePage(driver);
		
			
			//  extent.flush();
			  driver.close();
			   
				
			   ExtentTestManager.getTest().log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
		        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
		        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
		
  
		
	}
	  
*/

		}










