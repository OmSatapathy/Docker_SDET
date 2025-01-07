package core.dec30;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testExecution {

	@Test()
	public void test1(){
		System.out.println("test1");
	}
	@Test(groups={"smoke","end"})
	public void test2(){
		System.out.println("test2");
	}
	@Test(groups="smoke")
	public void test4(){
		System.out.println("test4");
	}
	@Test(groups="end")
	public void test5(){
		System.out.println("test5");
	}
	@Test(groups="end")
	public void test6(){
		System.out.println("test6");
	}
	@Test(groups="sanity")
	public void test3(){
		System.out.println("test3");
	}
	
	@BeforeTest
	public void bforetest(){
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("AfterTest");
	}
	@BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void Aftercalss(){
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");
	}
}
