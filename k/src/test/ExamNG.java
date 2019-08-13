package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExamNG {

	@Test
	public void testEquals() {
		Assert.assertEquals("actual", "expected", "log a equals defect");
		System.out.println("equals test passed");
	}

	@Test
	public void testBoolean() {
		Assert.assertTrue("actual".equals("expected"), "log a boolean defect");
		System.out.println("boolean test passed");
	}

	@Test
	public void testSoft() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("actual".equals("expected"), "log a soft defect");
		System.out.println("soft test passed");
		sa.assertAll();
	}
}