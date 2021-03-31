package com.is.palmbusapp_automation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class PalmbusAutomation {
	
	public static AndroidDriver<AndroidElement> ad = null;

	void tempSleep(int timeToSleep) {
		try
		{
		    Thread.sleep(timeToSleep);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
	
	
	@Test()
	void test1AddFavorite() throws MalformedURLException {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "c7cb4cdf7d2a");
		dc.setCapability("platformName", "android");
		dc.setCapability("appPackage", "com.is.android.cannes");
		dc.setCapability("appActivity" , "com.is.android.views.MainInstantSystem");
		
		ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		
		
		tempSleep(5000);
		
		MobileElement el1 = (MobileElement) ad.findElementById("android:id/button1");
		el1.click();
				
		tempSleep(3000);
		
		MobileElement el2 = (MobileElement) ad.findElementById("com.android.packageinstaller:id/permission_allow_button");
		el2.click();
		
		MobileElement el3 = (MobileElement) ad.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView");
		el3.click();
		MobileElement el4 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.view.ViewGroup/android.widget.ImageView[2]");
		el4.click();
		
		tempSleep(3000);		
		MobileElement el5 = (MobileElement) ad.findElementById("com.is.android.cannes:id/buttonEmptyView");
		el5.click();
		
		tempSleep(3000);
		MobileElement el6 = (MobileElement) ad.findElementByXPath("(//android.widget.FrameLayout[@content-desc=\"Add a favorite\"])[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView");
		el6.click();
		
		tempSleep(3000);
		
		MobileElement el7 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout[2]");
		el7.click();
		
		tempSleep(2000);
		MobileElement el8 = (MobileElement) ad.findElementById("com.is.android.cannes:id/buttonValid");
		el8.click();
		
		tempSleep(3000);
		MobileElement el9 = (MobileElement) ad.findElementByAccessibilityId("Back");
		el9.click();
		
		MobileElement e20 = (MobileElement) ad.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Home\"]/android.widget.ImageView");
		e20.click();
		
		tempSleep(2000);
	}
	
	@Test
	void test2SearchFavorite() throws MalformedURLException {
		
		tempSleep(1000);
		
		MobileElement el3 = (MobileElement) ad.findElementById("com.is.android.cannes:id/item_home_favorite_from_title");
		el3.click();
		
		tempSleep(2000);
		MobileElement el4 = (MobileElement) ad.findElementById("com.is.android.cannes:id/searchEditText");
		el4.sendKeys("Antibes");
		
		tempSleep(2000);
		MobileElement el5 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.TextView[1]");
		el5.click();
		
		tempSleep(2000);
		MobileElement el6 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[2]/android.view.ViewGroup/android.widget.ImageView");
		el6.click();
		
		tempSleep(2000);
		MobileElement el7 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[3]/android.view.ViewGroup/android.widget.ImageView");
		el7.click();
		
		tempSleep(2000);
		MobileElement el8 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/androidx.appcompat.app.ActionBar.Tab[4]/android.view.ViewGroup/android.widget.ImageView");
		el8.click();
		
		tempSleep(2000);
		MobileElement el9 = (MobileElement) ad.findElementByAccessibilityId("Back");
		el9.click();
		
		tempSleep(2000);
	}
	
	@Test
	void test3DeleteFavorite() {

		MobileElement el1 = (MobileElement) ad.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView");
		el1.click();
		
		tempSleep(2000);
		MobileElement el2 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView[2]/android.view.ViewGroup");
		el2.click();
		
		tempSleep(2000);
		MobileElement el3 = (MobileElement) ad.findElementById("com.is.android.cannes:id/menu");
		el3.click();
		
		tempSleep(2000);
		MobileElement el4 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.TextView");
		el4.click();
	}
}
