
package classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\AutomationTesting\\jars\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://todomvc.com/examples/angularjs/#/");
		
		NgWebDriver ngDriver=new NgWebDriver((JavascriptExecutor)driver);
		ngDriver.waitForAngularRequestsToFinish();
		
		driver.findElement(ByAngular.model("newTodo")).sendKeys("Drink Water");
		driver.findElement(ByAngular.model("newTodo")).sendKeys(Keys.ENTER);
		driver.findElement(ByAngular.model("newTodo")).sendKeys("Eat Fruits");
		driver.findElement(ByAngular.model("newTodo")).sendKeys(Keys.ENTER);
		try{
			Thread.sleep(2000);
			}
		catch(InterruptedException ie){
		}
		
		driver.findElement(ByAngular.model("todo.completed")).click();
		try{
			Thread.sleep(2000);
			}
		catch(InterruptedException ie){
		}
		driver.findElement(By.linkText("Active")).click();
		try{
			Thread.sleep(2000);
			}
		catch(InterruptedException ie){
		}
	
		driver.findElement(By.linkText("Completed")).click();
		try{
			Thread.sleep(2000);
			}
		catch(InterruptedException ie){
		}
		driver.findElement(By.linkText("All")).click();
		try{
			Thread.sleep(2000);
			}
		catch(InterruptedException ie){
		}
		driver.findElement(ByAngular.buttonText("Clear completed")).click();
		
		try{
			Thread.sleep(2000);
			}
		catch(InterruptedException ie){
		}
		driver.findElement(By.linkText("All")).click();
		driver.close();
		System.out.print("Execution done");
		
	}

}
