EDUREKA AUTOMATION SCRIPT

Project Overview:

This is an automation script created using Selenium WebDriver and Java for automating various tasks on the Edureka platform. The script performs actions such as login, updating profile details, and setting up a study plan.

Features:

The key actions automated by this script include:

    1)Login to Edureka – The script logs in using valid credentials.
    2)Profile Update – It automates updating profile details like name, designation, and department.
    3)Timezone Update – The script handles the selection of timezones.
    4)Set Study Plan – Automatically sets up the study plan, including the start and end times for classes.
    5)Logout – Safely logs out of the platform.

    
Prerequisites:

To run this automation script, you will need:
     1)Java Development Kit (JDK) 8 or higher.
     2)Selenium WebDriver.
     3)Google Chrome Browser.
     4)ChromeDriver – You can download the correct version of ChromeDriver for your Chrome browser from here.
     5)Maven (Optional) – For managing dependencies.

Script Execution:

    1)Run the EdurekaLogin.java file as a Java Application.
    2)The script will automatically perform all tasks on the Edureka platform:
    3)Login with your email and password
    4)Update profile information
    5)Set study plan timings
    6)Logout

Code Explanation:

   1) WebDriver Setup: Initializes ChromeDriver and maximizes the browser window:
      
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

   2) Login Process: Finds the email and password input fields, enters credentials, and submits the login form:
      
        WebElement mailid = driver.findElement(By.id("si_popup_email"));
        mailid.sendKeys("your-email@example.com");

   3) Profile Update: Updates the profile details by locating the corresponding fields and inputting new values:
      
        WebElement nameupdate = driver.findElement(By.id("fullName"));
        nameupdate.clear();
        nameupdate.sendKeys("Updated Name");

   4) Setting Study Plan: Interacts with dropdowns to select days and times:
      
        WebElement day = driver.findElement(By.xpath("//day-xpath"));
        day.click();
      
   5) Logout Process: Finds and clicks the logout button:
       
        WebElement logoutButton = driver.findElement(By.xpath("//button[text()='Log Out']"));
        logoutButton.click();


Future Enhancements:

    1)Cross-Browser Testing: Add support for other browsers like Firefox.
    2)Enhanced Reporting: Implement test reporting using frameworks like TestNG or JUnit.
    3)Error Handling: Improve error handling and recovery mechanisms.


Acknowledgements:
    
    1)Selenium WebDriver: For providing the tools for browser automation.
    2)ChromeDriver: For enabling automation with Google Chrome.
