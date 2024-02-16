package test.components;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.components.Engine;
import page.components.UrlLink;

public class UrlLinkTest extends Engine {

	// Test case to validate the Url Link is Broken or not
	@Test(priority = 1, groups = { "Regression", "Smoke" })
	public void brokenUrlValidationTc15() throws Exception {

		test = report.createTest("Tc15- Url Validation");

		UrlLink link = new UrlLink();

		link.brokenLink();

		test.log(Status.PASS, "Validation Succesfull");
	}

}
