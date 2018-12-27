package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilityClass extends SetupClass {

	public static void enterValue(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public static WebElement waiting(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public static void clickonButtons(WebElement element) {
		WebElement elm = waiting(element);
		elm.click();
	}

	public static void clickOnLinks(String linktext) {
		WebElement link = driver.findElement(By.linkText(linktext));
		WebElement waitLink = waiting(link);
		waitLink.click();
	}

	public static void selectfromDropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public static void selectfromDropdown(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
}
