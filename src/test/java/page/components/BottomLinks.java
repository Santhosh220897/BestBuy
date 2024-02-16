package page.components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.WebUtilis;

public class BottomLinks extends WebUtilis {

	// WebElements
	@FindBy(xpath = "(//div[@class='country-selection']//child::a)[2]")
	WebElement country;

	@FindBys({ @FindBy(xpath = "//div[@class='flex justify-content-start']//child::a") })
	public List<WebElement> bottomLinks;

	@FindBy(xpath = "//a[text()='Best Buy']")
	WebElement homePage;

	// PageFactory method to initialize
	public BottomLinks() {

		PageFactory.initElements(driver, this);
	}

	// Method to check the bottomLink
	public void validateBottomLink(String linkText, String expTitle) throws Exception {

		waitClickable(country, 40);
		nrmlClick(country);
		pageDown();
		dropdownList(bottomLinks, linkText);
		String actual = getTitle();
		String expected = expTitle;
		Assert.assertEquals(actual, expected);

		screenshot("BottomLinks");
		waitClickable(homePage, 40);
		nrmlClick(homePage);
	}

	// Method to check the bottomLink & navigate to next Link
	public void validateNextLink(String linkText, String expTitle) throws Exception {

		pageDown();
		dropdownList(bottomLinks, linkText);
		pageWait(40);
		String actual = getTitle();
		String expected = expTitle;
		Assert.assertEquals(actual, expected);

		screenshot("BottomLinks");
		navBack();
		pageWait(30);
	}
}
