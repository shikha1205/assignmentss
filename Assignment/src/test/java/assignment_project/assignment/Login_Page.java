package assignment_project.assignment;


	import java.sql.Driver;
	import java.util.concurrent.TimeUnit;
	 
	import org.openqa.selenium.By;
	 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.FindBy;
	import org.testng.annotations.Test;
	 
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterMethod;
	 

	public class Login_Page {
		
		
		private WebDriver driver;
		
		private By username=By.id("id_username");
		private By password=By.id("id_password");
		private By loginBtn=By.id("login-sub");
		
		public static WebElement element = null;
		 
		
		public Login_Page(WebDriver driver) {
			
			this.driver=driver;
		}
		
		 public WebElement Txbox_username(){
			 
			 element=driver.findElement(username);
		 
		    return element;
		 
		    }
		 
	      public WebElement Txbox_password(){
			 
			 element=driver.findElement(password);
		 
		    return element;
		 
		    }
	      
	     
		 
	      public WebElement Login_Button(){
	 		 
	 		 element=driver.findElement(loginBtn);
	 	 
	 	    return element;
	 	 
	 	    }
	 	 
	      public void setUserName(String strUserName){

	    	  driver.findElement(username).sendKeys(strUserName);

	          

	      }
	      
	      public void setPassword(String strPasswrd){

	    	  driver.findElement(password).sendKeys(strPasswrd);
	    	  
	          

	      }
	      
	      public void setUrl(WebDriver driver){

	    	  driver.navigate().to("https://manage.plivo.com/accounts/login/");
	          

	      }
	      
	     

		 
		 

	}


