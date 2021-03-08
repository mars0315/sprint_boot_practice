package com.mars.test.testUtils;//package com.lemon.phoenix.tester;
//
//import org.testng.annotations.Test;
//
//import com.lemon.phoenix.base.Base;
//import com.lemon.phoenix.listener.TestngRetry;
//import com.lemon.phoenix.util.ExcelUtil;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.functions.ExpectedCondition;
//import io.appium.java_client.remote.AutomationName;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.ClickAction;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//
//public class LoginTest extends Base{
//
//	public AndroidDriver<WebElement> androidDriver;
//
//	/**
//	 * 在主页上的操作
//	 *
//	 * @throws InterruptedException
//	 */
//	@Test(priority = 1)
//	public void testMainPage() throws InterruptedException {
//		// 点击我的柠檬
//		click("主页页面","我的柠檬");
//		// 点击头像登录
//		click("主页页面", "点击头像登录");
//	}
//
//	@Test(dataProvider = "getFailureDatas", priority = 5)
//	public void testFailureLogin(String mobilephone, String pwd, String tips) throws InterruptedException {
//		// 在登录页面去输入手机号码\密码
//		Thread.sleep(2000);
//		input("登录页面", "手机号码输入框", mobilephone);
//		input("登录页面", "密码输入框", pwd);
//		// 点击登录按钮
//		click("登录页面", "登录按钮");
//		// 获取到登录失败之后的toast信息
//		//String toastTips = getToast(tips);
//		//Assert.assertEquals("hello", "lemon");
//		//Assert.assertEquals(toastTips, tips);
//	}
//
//	@Test(dataProvider = "getSuccessDatas", priority = 10)
//	public void testSuccessLogin(String mobilephone, String pwd, String tips) throws InterruptedException {
//		// 在登录页面去输入手机号码\密码
//		input("登录页面", "手机号码输入框", mobilephone);
//		input("登录页面", "密码输入框", pwd);
//		// 点击登录按钮
//		click("登录页面", "登录按钮");
//		Thread.sleep(5000);
//		//登录跳转之后页面是主页页面，断言成功，反之断言失败
////		Assert.assertEquals(getActivityName("主页页面"), getCurrentActivityName());
//		//Assert.assertEquals("hello", "world");
//	}
//
//	@DataProvider
//	public static Object[][] getFailureDatas() {
//		Object[][] datas = ExcelUtil.readExcel("/lemon_testcase.xlsx", 2, 5, 1, 3);
//		return datas;
//	}
//
//	@DataProvider
//	public static Object[][] getSuccessDatas() {
//		Object[][] datas = ExcelUtil.readExcel("/lemon_testcase.xlsx", 6, 6, 1, 3);
//		return datas;
//	}
//
//}
