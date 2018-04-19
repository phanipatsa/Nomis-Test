//Initialize the Package and import all the required functions

package nomi;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nomi {

	
	public WebDriver driver;
	public WebDriverWait wait;
	public static void main(String[] args) throws Exception {
		System.out.println("Hi");
		
		
	    Nomi obj = new Nomi();
	    
	   	//Step1: To Launch home page and navigate the webpage.
	    	obj.launch();
	    	obj.navigate();
		
		//Step2: Use the Search feature on the website.
		obj.launch();
		obj.search();
		
		//Step3: Submit the Assessment form on the webpage.
		obj.launch();
		obj.assessment();
		
		obj.driver.quit();
	    
	}

	//Reusable Function to lauch the webpage
	
	public void launch() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.nomissolutions.com");
	     driver.manage().window().maximize();
	}
	
	//Function to navigate to Solutions & Products -> Mortgages and click on 'Solution Brief'
	
	public void navigate() throws Exception{
		
		Actions action = new Actions(driver);
		WebElement sp = driver.findElement(By.linkText("Solutions & Products"));
		action.moveToElement(sp).build().perform();
		WebElement mg = driver.findElement(By.linkText("Mortgages"));
		action.moveToElement(mg).build().perform();
		mg.click();
		driver.findElement(By.linkText(" Solution Brief »")).click();
		wait = new WebDriverWait(driver, 10);
		if(driver.findElement(By.xpath("//h2[text()='Solution Brief']")).isDisplayed())
		System.out.println("Solution Brief page is displayed");
		this.takeSnapShot(driver, System.getProperty("user.dir")+"\\Results\\Run_"+getTimeStamp()+".png");
		driver.close();		
	
		
	}
	
	//Function to Search website
	
	public void search() throws Exception {
		driver.findElement(By.name("search")).sendKeys("NOMI");
		driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		this.takeSnapShot(driver, System.getProperty("user.dir")+"\\Results\\Run_"+getTimeStamp()+".png");
		driver.close();	
	}
	
	//Function to submit assessment form
	public void assessment() throws Exception {
		if(driver.findElement(By.xpath("//span[text()='Get Started']")).isDisplayed())
			driver.findElement(By.xpath("//span[text()='Get Started']")).click();
			driver.findElement(By.name("firstname")).sendKeys("FNAME");
			driver.findElement(By.name("lastname")).sendKeys("LNAME");
			driver.findElement(By.name("hs_persona")).sendKeys("Executive");			
			driver.findElement(By.name("email")).sendKeys("lname" + getTimeStamp()+ "@amex.com");
			driver.findElement(By.name("company")).sendKeys("ABC Corp");
			driver.findElement(By.name("phone")).sendKeys("1234567890");
			driver.findElement(By.name("phone")).sendKeys(Keys.ENTER);			
			Thread.sleep(2000);
			System.out.println("Assessment Completed");
			this.takeSnapShot(driver, System.getProperty("user.dir")+"\\Results\\Run_"+getTimeStamp()+".png");
			driver.close();
	}
	
	//Reusable Function to capture screen shot
	
	public  void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	//Reusable Function to get date and time
	public String getTimeStamp(){
		DateFormat df = new SimpleDateFormat("ddMMyy_HHmmss");
		Calendar calobj = Calendar.getInstance();
		return df.format(calobj.getTime());
	}

}
