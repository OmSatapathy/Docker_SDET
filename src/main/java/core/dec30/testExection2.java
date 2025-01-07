package core.dec30;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testExection2 {

	@Test
	public void test1(){
		System.out.println("test121");
	}
	@Test
	public void test2(){
		System.out.println("test231");
	}
	@Test
	public void test3(){
		System.out.println("test21");
	}
	@BeforeTest
	public void bforetest(){
		System.out.println("BeforeTest2");
	}
	@AfterTest
	public void AfterTest(){
		System.out.println("AfterTest21");
	}
	@BeforeClass
	public void BeforeClass(){
		System.out.println("BeforeClass21");
	}
	
	@AfterClass
	public void Aftercalss(){
		System.out.println("after class21");
	}
	
	@BeforeMethod
	public void BeforeMethod(){
		System.out.println("BeforeMethod2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod2");
	}
}
