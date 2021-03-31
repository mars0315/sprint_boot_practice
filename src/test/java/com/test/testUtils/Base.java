//package com.lemon.phoenix.base;
//
//import java.io.IOException;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.List;
//import java.util.Set;
//
//import org.apache.commons.io.monitor.FileAlterationListener;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
//
//import com.lemon.phoenix.pojo.Locator;
//import com.lemon.phoenix.pojo.Page;
//import com.lemon.phoenix.util.PortUtil;
//import com.lemon.phoenix.util.XmlUtil;
//
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.Activity;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.functions.ExpectedCondition;
//import io.appium.java_client.remote.AutomationName;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//public class Base {
//	public  AndroidDriver<WebElement> androidDriver;
//
//	private Logger logger =Logger.getLogger(Base.class);
//
//	//使用Threadlocal来保证线程的安全问题，以免testng在去进行多线程并发测试访问androidDriver线程安全问题
//	private static ThreadLocal<AndroidDriver> threadDrvier = new ThreadLocal<AndroidDriver>();
//
//	@BeforeTest
//	@Parameters(value = { "deviceName", "platformName", "appPackage", "appActivity", "appiumUrl", "uiautomator2_port" })
//	public void setUp(String deviceName, String platformName, String appPackage, String appActivity, String appiumUrl,String uiautomator2_port)
//			throws MalformedURLException, InterruptedException {
//		//保证appium server全部开启，所以我们需要加上等待
//		Thread.sleep(6000);
//		logger.info("=======================初始化androidDriver=====================");
//		// 1、打开测试app
//		// （1）、初始化DesiredCapabilities对象
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//		// （2）、deviceName：因为现在我们需要知道要测试的设备是哪一台？？
//		desiredCapabilities.setCapability("deviceName", deviceName);
//		// （3）、platformName：现在需要知道测试哪个平台，android or IOS？？
//		desiredCapabilities.setCapability("platformName", platformName);
//		// （4）、appPackage：知道测试哪个应用：包名来标识
//		desiredCapabilities.setCapability("appPackage", appPackage);
//		// （5）、appActivity：需要知道怎么去启动测试的app。入口类名
//		desiredCapabilities.setCapability("appActivity", appActivity);
//		// noReset true:表示不清除应用的数据而进行测试， false:清除应用的数据
//		// desiredCapabilities.setCapability("noReset", true);
//		// 指定automationName为Uiautomator2支持toast获取
//
//		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//		//指定uiautomator2的端口
//		desiredCapabilities.setCapability("systemPort", uiautomator2_port);
//		//System.out.println(uiautomator2Port);
//		// （6）、初始化driver，打开测试app
//		//如果threadDriver里面有androidDriver。那么我们不需要进行存放
//		if(androidDriver == null){
//			androidDriver = new AndroidDriver<WebElement>(new URL(appiumUrl), desiredCapabilities);
//			threadDrvier.set(androidDriver);
//		}
//
//		logger.info("当前的初始化配置为:"+androidDriver.getCapabilities());
//	}
//
//	@AfterTest
//	public void tearDown() {
//		// 在测试用例执行完毕之后关闭驱动
//		logger.info("=======================关闭androidDriver=====================");
//		androidDriver.quit();
//		for(String pid:PortUtil.getAllPortList()){
//			//遍历杀死端口对应的进程
//			PortUtil.killProcessByPid(pid);
//		}
//	}
//
//	/**
//	 * 从threadLocal本地变量中去取得androidDriver
//	 * @return
//	 */
//	public static AndroidDriver getAndroidDriver(){
//		return threadDrvier.get();
//	}
//
//	/**
//	 * 智能等待
//	 *
//	 * @param by
//	 */
//	public WebElement getElement(String pageDesc, String locatorDesc) {
//		// 根据页面的关键字/元素关键字找到对应元素的定位信息by value
//		String locatorBy = "";
//		String locatorValue = "";
//		for (Page page : XmlUtil.pages) {
//			String desc1 = page.getPageDesc();
//			String activityName = page.getActivityName();
//			if (pageDesc.equals(desc1)) {
//				List<Locator> locators = page.getLocators();
//				for (Locator locator : locators) {
//					String desc2 = locator.getDesc();
//					if (locatorDesc.equals(desc2)) {
//						locatorBy = locator.getBy();
//						locatorValue = locator.getValue();
//					}
//				}
//			}
//
//		}
//		// 为了解决普通变量不能直接在内部类中使用，我们采取用中间final变量进行接收处理
//		final String locatorBy2 = locatorBy;
//		final String locatorValue2 = locatorValue;
//		// 1、初始化webDriverWait
//		WebDriverWait webDriverWait = new WebDriverWait(getAndroidDriver(), 30);
//		// 2、使用webDriverWait的until
//		WebElement webElement = null;
//		try {
//			webElement = webDriverWait.until(new ExpectedCondition<WebElement>() {
//
//				@Override
//				public WebElement apply(WebDriver input) {
//					// TODO Auto-generated method stub
//					try {
//						// 反射去得到对应的by对象
//						// 1、得到类的字节码
//						Class<By> clazz = By.class;
//						// 2、根据字节码得到对应执行方法
//						Method method = clazz.getMethod(locatorBy2, String.class);
//						// 3、执行对应的方法,返回By对象
//						By by = (By) method.invoke(null, locatorValue2);
//						return getAndroidDriver().findElement(by);
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						//e.printStackTrace();
//					}
//					return null;
//				}
//			});
//		} catch (Exception e) {
//			// 日志处理
//		}
//		return webElement;
//	}
//
//	/**
//	 * 获取toast提示信息的智能等待方法
//	 * @param tips
//	 */
//	public String getToast(final String tips){
//		logger.info("获取toast:【"+tips+"】");
//		WebDriverWait webDriverWait = new WebDriverWait(getAndroidDriver(), 30);
//		WebElement webElement = webDriverWait.until(new ExpectedCondition<WebElement>() {
//
//			@Override
//			public WebElement apply(WebDriver input) {
//				// TODO Auto-generated method stub
//				return getAndroidDriver().findElement(By.xpath("//*[contains(@text, '" + tips + "')]"));
//			}
//		});
//		return webElement.getText();
//	}
//
//
//	public String getActivityName(String pageDesc){
//		//根据页面关键字找到对应页面类名
//		for (Page page : XmlUtil.pages) {
//			String desc = page.getPageDesc();
//			if(pageDesc.equals(desc)){
//				logger.info("根据关键字:【"+pageDesc+"】找到对应的activityName:【"+page.getActivityName()+"】");
//				return page.getActivityName();
//			}
//
//		}
//		return "";
//	}
//
//	/**
//	 * 得到当前页面的activityName
//	 * @return
//	 */
//	public String getCurrentActivityName(){
//		return androidDriver.currentActivity();
//	}
//
//	public void click(String pageDesc, String locatorDesc) {
//		logger.info("在页面【"+pageDesc+"】找到元素【"+locatorDesc+"】并点击");
//		getElement(pageDesc, locatorDesc).click();
//	}
//
//	public void input(String pageDesc, String locatorDesc, String data) {
//		logger.info("在页面【"+pageDesc+"】找到元素【"+locatorDesc+"】输入【"+data+"】");
//		getElement(pageDesc, locatorDesc).sendKeys(data);
//	}
//
//	/**
//	 * 执行adb命令
//	 */
//	public void execAdb(String cmdstr) {
//		// 当前环境运行时对象
//		Runtime runtime = Runtime.getRuntime();
//		try {
//			runtime.exec(cmdstr);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * app页面跳转
//	 */
//	public void startPage() {
//		// 初始化activity对象
//		Activity activity = new Activity("com.microvirt.market", "com.microvirt.market.activity.MainActivity");
//		getAndroidDriver().startActivity(activity);
//	}
//
//	/**
//	 * 自定义通过text本文找元素的方法
//	 *
//	 * @param text
//	 *            元素文本值
//	 */
//	public WebElement findElementByText(String text) {
//		return getAndroidDriver().findElementByAndroidUIAutomator("new UiSelector().text(\"" + text + "\")");
//	}
//
//	/**
//	 * 自定义下拉刷新滑动方法
//	 */
//	public void swipeDown() {
//		// 1、初始化touchAction对象，和触摸相关操作
//		TouchAction touchAction = new TouchAction(getAndroidDriver());
//		// 2、得到滑动起始点、滑动终止点、滑动经过时间(通过得到手机屏幕的高度/宽度再计算起始点。。。)
//		int screenWidth = getAndroidDriver().manage().window().getSize().width;
//		int screenHeight = getAndroidDriver().manage().window().getSize().height;
//		// 起始点坐标
//		int startx = screenWidth / 2;
//		int starty = screenHeight / 4;
//
//		// 终止点坐标
//		int endx = screenWidth / 2;
//		int endy = screenHeight * 3 / 4;
//
//		Duration duration = Duration.ofMillis(100);
//		touchAction.press(startx, starty).waitAction(duration).moveTo(endx, endy).release();
//		touchAction.perform();
//	}
//
//}
