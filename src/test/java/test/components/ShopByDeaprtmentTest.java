package test.components;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.components.Engine;
import page.components.ShopByDepartmentCart;

public class ShopByDeaprtmentTest extends Engine {

	// Testcase to validate the add to cart by clicking on department
	@Test(priority = 1, groups = { "Regression", "Smoke" })
	public void departCartTc08() throws Exception {

		test = report.createTest("Tc08-Adding Cart through Department");

		ShopByDepartmentCart department = new ShopByDepartmentCart();

		department.departmentCart1(readingExcel("Department", 1, 0), readingExcel("Department", 1, 1),
				readingExcel("Department", 1, 2));

		test.log(Status.PASS, "Added to cart");
	}

	// Testcase to validate the add to cart by clicking on department
	@Test(priority = 2, groups = { "Regression"})
	public void departCartTc09() throws Exception {

		test = report.createTest("Tc09-Adding Cart through Department");

		ShopByDepartmentCart department = new ShopByDepartmentCart();

		department.departmentCart2(readingExcel("Department", 2, 0), readingExcel("Department", 2, 1),
				readingExcel("Department", 2, 2));

		test.log(Status.PASS, "Added to cart");
	}
}
