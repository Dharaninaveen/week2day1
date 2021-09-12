package Week2.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfalink=driver.findElement(By.linkText("CRM/SFA"));
		crmsfalink.click();	
		WebElement leadlinktext=driver.findElement(By.linkText("Leads"));
		leadlinktext.click();	
		WebElement createleadlinktext=driver.findElement(By.linkText("Create Lead"));
		createleadlinktext.click();	
		WebElement companyname=driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("TCS");
		WebElement firstname=driver.findElement(By.id("createLeadForm_firstName"));
		firstname.sendKeys("Dharani");
		
		WebElement firstnameloc=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstnameloc.sendKeys("DharaniNaveen");
		WebElement salutation=driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("training");
		WebElement titlenam=driver.findElement(By.id("createLeadForm_generalProfTitle"));
		titlenam.sendKeys("Selenium");
		WebElement annualrev=driver.findElement(By.id("createLeadForm_annualRevenue"));
		annualrev.sendKeys("1000000");
		WebElement siccode=driver.findElement(By.id("createLeadForm_sicCode"));
		siccode.sendKeys("121127");
		WebElement lastname=driver.findElement(By.id("createLeadForm_lastName"));
		lastname.sendKeys("Rajendran");
		WebElement marketid=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		marketid.sendKeys("1308");
		WebElement lastnameloc=driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastnameloc.sendKeys("rajendran");
	
		WebElement depname=driver.findElement(By.id("createLeadForm_departmentName"));
		depname.sendKeys("system eng");
		WebElement noofemp=driver.findElement(By.id("createLeadForm_numberEmployees"));
		noofemp.sendKeys("5000");
		WebElement tickerSymbol=driver.findElement(By.id("createLeadForm_tickerSymbol"));
		tickerSymbol.sendKeys("greenorg");
		WebElement descrip=driver.findElement(By.id("createLeadForm_description"));
		descrip.sendKeys("Learning more to update me ");
		WebElement impnote=driver.findElement(By.id("createLeadForm_importantNote"));
		impnote.sendKeys("overall achievement is increasing year by year");
		WebElement countrycode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countrycode.clear();
		countrycode.sendKeys("55");
		WebElement areacode=driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		areacode.sendKeys("6379");
		WebElement extension=driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		extension.sendKeys("91");
		WebElement phonenum=driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phonenum.sendKeys("98765432");
		WebElement persontoask=driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		persontoask.sendKeys("guardian");
		WebElement email=driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("asdfg@gmail.com");
		WebElement weburl=driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		weburl.sendKeys("www.seleniumdharani.com");
		WebElement toname=driver.findElement(By.id("createLeadForm_generalToName"));
		toname.sendKeys("dharaniridhuna");
		WebElement attenname=driver.findElement(By.id("createLeadForm_generalAttnName"));
		attenname.sendKeys("ridhuna");
		WebElement genadd1=driver.findElement(By.id("createLeadForm_generalAddress1"));
		genadd1.sendKeys("jedarpalayam");
		WebElement genadd2=driver.findElement(By.id("createLeadForm_generalAddress2"));
		genadd2.sendKeys("namakkal");
		WebElement city=driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("namakkal");
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		state.sendKeys("alasca");
		WebElement postalcode=driver.findElement(By.id("createLeadForm_generalPostalCode"));
		postalcode.sendKeys("637213");
		WebElement genpostalcode=driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		genpostalcode.sendKeys("676767");
		WebElement createlead=driver.findElement(By.className("smallSubmit"));
		createlead.click();
		String viewtitle=driver.getTitle();
		System.out.println(viewtitle);
		
		
	}
}
