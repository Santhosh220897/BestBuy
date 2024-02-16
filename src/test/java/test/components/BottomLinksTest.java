package test.components;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.components.Engine;
import page.components.BottomLinks;

public class BottomLinksTest extends Engine {

	// Testcase to validate the bottom links and validate the title
	@Test(priority = 1, groups = { "Regression", "Smoke" })
	public void bottomLinksTc13() throws Exception {

		test = report.createTest("Tc13-Validating Bottom Links");

		BottomLinks bottom = new BottomLinks();
		bottom.validateBottomLink(readingExcel("Bottom", 1, 0), readingExcel("Bottom", 1, 1));
		bottom.validateNextLink(readingExcel("Bottom", 2, 0), readingExcel("Bottom", 2, 1));
		bottom.validateNextLink(readingExcel("Bottom", 3, 0), readingExcel("Bottom", 3, 1));
		bottom.validateNextLink(readingExcel("Bottom", 4, 0), readingExcel("Bottom", 4, 1));
		bottom.validateNextLink(readingExcel("Bottom", 5, 0), readingExcel("Bottom", 5, 1));
		bottom.validateNextLink(readingExcel("Bottom", 6, 0), readingExcel("Bottom", 6, 1));
		bottom.validateNextLink(readingExcel("Bottom", 7, 0), readingExcel("Bottom", 7, 1));
		bottom.validateNextLink(readingExcel("Bottom", 8, 0), readingExcel("Bottom", 8, 1));
		bottom.validateNextLink(readingExcel("Bottom", 9, 0), readingExcel("Bottom", 9, 1));
		bottom.validateNextLink(readingExcel("Bottom", 10, 0), readingExcel("Bottom", 10, 1));

		test.log(Status.PASS, "Bottom Links Validated");
	}

}
