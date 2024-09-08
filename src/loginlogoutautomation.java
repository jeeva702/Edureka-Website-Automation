import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginlogoutautomation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			
			driver.get("https://www.edureka.co/");

		
			Actions actions = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver, 20);

			WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/nav[1]/ul[1]/li[4]/span[1]")));
			actions.moveToElement(login).click().perform();

			WebElement mailid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='si_popup_email']")));
			actions.moveToElement(mailid).click().sendKeys("jeevachennakesavan@gmail.com").perform();

			WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='si_popup_passwd']")));
			actions.moveToElement(password).click().sendKeys("Jeeva@123").perform();

			WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Login')]")));
			actions.moveToElement(loginbutton).click().perform();

			
			WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class, 'dropdown-toggle')]//img[contains(@class, 'img30')]")));
			profile.click();
			Thread.sleep(3000);

			WebElement myprofile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(@class,'giTrackElementHeader') and normalize-space(text())='My Profile']")));
			myprofile.click();
			Thread.sleep(3000);

			WebElement myElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-lg-8 col-md-8 col-sm-12 col-xs-12 prof-career-other-details']//div[1]//div[1]//a[1]//i[1]")));
			myElement.click();

			WebElement nameupdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'fullName')]")));
			nameupdate.sendKeys(Keys.CONTROL + "A");
			nameupdate.sendKeys(Keys.BACK_SPACE);
			nameupdate.sendKeys("Jeeva C");
//			Thread.sleep(3000);

			WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.id("designation")));
			actions.moveToElement(destination).perform();
			destination.sendKeys(Keys.CONTROL+"A");
			destination.sendKeys(Keys.BACK_SPACE);
			destination.sendKeys("Chennai");
//			Thread.sleep(3000);

			
			WebElement department = driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ngx-select-dropdown[1]/div[1]/button[1]"));
			actions.moveToElement(department).click().perform();
			System.out.println("Dropdown opened");

			
			List<WebElement> options = driver.findElements(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/ngx-select-dropdown[1]/div[1]/div[1]/ul[2]/li"));

			
			for (WebElement option : options) {
			    System.out.println("Option text: " + option.getText());

			    if (option.getText().contains("IT-Software / Software Services")) {
//			        wait.until(ExpectedConditions.elementToBeClickable(option));
			        actions.moveToElement(option).click().perform();
			        System.out.println("Option found, clicking on it.");
//   		        option.click();
			        break;
			    }
			}
			
//			Thread.sleep(3000);

			WebElement timezone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ngx-select-dropdown[1]/div[1]/button[1]")));
			Thread.sleep(3000);
			//			timezone.click();
			System.out.println("timezone");
			actions.moveToElement(timezone).click().perform();

			WebElement timezonesearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ngx-select-dropdown[1]/div[1]/div[1]/div[1]/input[1]")));
			timezonesearch.sendKeys(Keys.CONTROL + "A");
			timezonesearch.sendKeys(Keys.BACK_SPACE);
			timezonesearch.sendKeys("India-");


			List<WebElement> indiatimezone=driver.findElements(By.xpath("//*[@id=\'mat-tab-content-0-0\']/div/div/div/div[2]/div[2]/div/div/ngx-select-dropdown/div/div/ul[2]/li"));

			for (WebElement webElement8 : indiatimezone) {
				System.out.println(webElement8);
				if(webElement8.getText().contains("India-IST-Asia/Kolkata")) {
//					wait.until(ExpectedConditions.elementToBeClickable(webElement8)); 
//					webElement8.click();
					actions.moveToElement(webElement8).click().perform();

				}
				}
//			Thread.sleep(3000);
			
			WebElement firstdate=driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/ngx-select-dropdown[1]/div[1]/button[1]"));
			actions.moveToElement(firstdate).click().perform();
			
			
			WebElement firstdateselect=driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/ngx-select-dropdown[1]/div[1]/div[1]/div[1]/input[1]"));
			firstdateselect.click();
			Thread.sleep(3000);
			firstdateselect.sendKeys("11:00 A");
			
			
			
			
			List <WebElement> firstdatelist =driver.findElements(By.xpath("//*[@id=\'mat-tab-content-0-0\']/div/div/div/div[2]/div[3]/div[2]/div[2]/div[1]/ngx-select-dropdown/div/div/ul[2]/li"));
			for (WebElement first : firstdatelist) {
			    System.out.println("Checking option: " + first.getText());
			    String aa = first.getText();
			    if (aa.contains("11:00 AM")) {
			        System.out.println("Match found: " + aa);
//			        WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(first));
//			        clickableElement.click();
			        actions.moveToElement(first).click().perform();
			        System.out.println("Clicked on the option: " + aa);
			        break;
			    }
			}

//			Thread.sleep(3000);
			
			WebElement lastdate=driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/ngx-select-dropdown[1]/div[1]/button[1]"));
			actions.moveToElement(lastdate).click().perform();
			
			WebElement lastdateselect=driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[2]/ngx-select-dropdown[1]/div[1]/div[1]/div[1]/input[1]"));
			lastdateselect.click();
			lastdateselect.sendKeys("12:00 P");
			
			
			List <WebElement> lastdatelist=driver.findElements(By.xpath("//*[@id=\'mat-tab-content-0-0\']/div/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/ngx-select-dropdown/div/div/ul[2]/li"));
			for (WebElement last: lastdatelist) {
				if(last.getText().contains("12:00 PM")) {
//					Thread.sleep(3000);
//					wait.until(ExpectedConditions.elementToBeClickable(last)); 
					actions.moveToElement(last).click().perform();
					
				}	
			}
              
			WebElement nextbutton1=driver.findElement(By.xpath("//button[contains(text(),'Save and Continue')]"));
			actions.moveToElement(nextbutton1).click().perform();
           
			driver.navigate().to("https://learning.edureka.co/my-profile");



			WebElement userdetails = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-lg-8 col-md-8 col-sm-12 col-xs-12 prof-career-other-details']//div[2]//div[1]//a[1]//i[1]")));
			userdetails.click();


			List <WebElement> carrergoal=driver.findElements(By.xpath("//*[@id=\"mat-tab-content-0-1\"]/div/div/div/div[2]/div[1]/div/ul/li"));

			for (WebElement goal : carrergoal) {
				if(goal.getText().equals("Higher Salary")) {
					goal.click();
				}}

			WebElement refername = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='goal']")));
			refername.click();
			refername.sendKeys(Keys.CONTROL+"A");
			refername.sendKeys(Keys.BACK_SPACE);
			refername.sendKeys("Such as financial stability, the ability to meet personal and family needs, and the potential for saving and investing for the future.");
			Thread.sleep(3000);

			WebElement friendname=driver.findElement(By.xpath("//input[@id='partnerName']"));
			friendname.clear();
			Thread.sleep(3000);
			friendname.sendKeys("Kandhan VS");
			Thread.sleep(3000);


			WebElement friendemailid= driver.findElement(By.xpath("//*[@id=\'mat-tab-content-0-1\']/div/div/div/div[2]/div[3]/div[2]/div[2]/div/div[1]/input"));
			friendemailid.clear();
			Thread.sleep(3000);
			friendemailid.sendKeys("jeevachennakesavan@gmail.com");
			Thread.sleep(3000);


			WebElement phonenumber=driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
			phonenumber.clear();
			Thread.sleep(3000);
			phonenumber.sendKeys("7989278295");
			Thread.sleep(3000);


			WebElement save = driver.findElement(By.xpath("//button[contains(text(),'Save and Continue')]"));		
			actions.moveToElement(save).click().perform();

//			Thread.sleep(3000);

			driver.navigate().to("https://learning.edureka.co/my-profile");
			Thread.sleep(3000);



			WebElement studyplan = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]//div[1]//a[1]//i[1]")));
			studyplan.click();
			

		

			WebElement day=driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ngx-select-dropdown[1]/div[1]/button[1]"));
			actions.moveToElement(day).click().perform();
			
			Thread.sleep(3000);


			WebElement dayenter3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ngx-select-dropdown[1]/div[1]/div[1]/div[1]")));
//			dayenter3.sendKeys(Keys.CONTROL+"A");
//			dayenter3.sendKeys(Keys.BACK_SPACE);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", dayenter3);
			dayenter3.click();
			actions.moveToElement(dayenter3).click().sendKeys("M").perform();
			
			Thread.sleep(3000);


			List<WebElement> selectDayEnter = driver.findElements(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ngx-select-dropdown[1]/div[1]/div[1]/ul[2]/li"));

			for (WebElement daySelect : selectDayEnter) {
				String dayText = daySelect.getText();
				System.out.println(dayText); 
				
				if (dayText.equals("Monday")) {
					WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(daySelect));
					clickableElement.click();
//					daySelect.click(); 
					break; 
				}
			}

//			Thread.sleep(3000);

			WebElement time=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ngx-select-dropdown[1]/div[1]/button[1]")));

			actions.moveToElement(time).click().perform();


			WebElement timeenter=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/ngx-select-dropdown[1]/div[1]/div[1]/div[1]/input[1]")));
			timeenter.sendKeys(Keys.CONTROL+"A");
			timeenter.sendKeys(Keys.BACK_SPACE);
			actions.moveToElement(timeenter).click().sendKeys("07:00 A").perform();


			List<WebElement> timeentersample = driver.findElements(By.xpath("//*[@id=\'mat-tab-content-0-2\']/div/div/div/div[2]/div/div[2]/div/div[2]/div[1]/ngx-select-dropdown/div/div/ul[2]"));

			for (WebElement timeSelect : timeentersample) {
				String timeText = timeSelect.getText();

				// Use a regular expression to match the exact time format (07:00 AM)
				if (timeText.contains("07:00 AM")) {
					WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(timeSelect));
					
					clickableElement.click();
					break;
				}
			}


			WebElement totime=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/ngx-select-dropdown[1]/div[1]/button[1]")));

			actions.moveToElement(totime).click().perform();


			WebElement totimeenter=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/ngx-select-dropdown[1]/div[1]/div[1]/div[1]/input[1]")));
			totimeenter.sendKeys(Keys.CONTROL+"A");
			totimeenter.sendKeys(Keys.BACK_SPACE);

			actions.moveToElement(totimeenter).click().sendKeys("09:00 A").perform();


			List<WebElement> totimeentersample = driver.findElements(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/ngx-select-dropdown[1]/div[1]/div[1]/ul[2]/li"));

			for (WebElement totimeSelect : totimeentersample) {
				String timeText = totimeSelect.getText();

				// Use a regular expression to match the exact time format (07:00 AM)
				if (timeText.contains("09:00 AM")) {
					WebElement clickableElement2 = wait.until(ExpectedConditions.elementToBeClickable(totimeSelect));
					clickableElement2.click();
					break;
				}
			}

			WebElement closedate=driver.findElement(By.xpath("//button[contains(text(),'Save and Continue')]"));
			actions.moveToElement(closedate).click().perform();


//			driver.navigate().to("https://learning.edureka.co/my-profile");
			
			
			
			
			WebElement profile1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class, 'dropdown-toggle')]//img[contains(@class, 'img30')]")));
			profile1.click();
			Thread.sleep(3000);

			List<WebElement> loginclose44=driver.findElements(By.xpath("/html/body/header/nav/div[4]/ul/li[6]/ul"));
//			actions.moveToElement(loginclose).click().perform();
			for (WebElement lologit : driver.findElements(By.xpath("//ul[@class='dropdown-menu user-menu dropdown-menu-right']//a[@class='trackButton']")))  {
			    if(lologit.getText().contains("Log Out")) {
			        actions.moveToElement(lologit).click().perform();
			        break;  // Break the loop once the "Log Out" is clicked
			    }
			}

			
	



		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
//			 driver.quit();
		}

	}
}
