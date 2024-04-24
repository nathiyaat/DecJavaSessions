package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	
//	BS --> DB connection
//	BT ---> create user
//	BC ---> launch browser
	
//	BM ---> login to app
//	header test
//	logout 
	
//	BM ---> login to app
//	title test
//	logout 
	
//	BM ---> login to app
//	url test
//	logout 
	
//	close browser 
//	delete user 

	
	//before annotations
	//1
	@BeforeSuite 
	public void dbConnection() {
		System.out.println("BS --> DB connection");
	}
	//2
	@BeforeTest
	public void createUSer() {
		System.out.println("BT ---> create user");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC ---> launch browser");
	}
	//4  7  10
	@BeforeMethod
	public void login() {
		System.out.println("BM ---> login to app");
	}
	
	//8 t 
	@Test
	public void titleTest() {
		System.out.println("title test");
	}
	
	//5 bcz of alphabet h in headerTest
	@Test
	public void headerTest() {
		System.out.println("header test");
	}
	//11
	@Test
	public void urlTest() {
		System.out.println("url test");
	}
	
	//after annotaions
	//6  9 12
	@AfterMethod 
	public void logout() {
		System.out.println("logout ");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC--- close browser ");

	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT --delete user ");

	}
	//15 number in order
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS --disconnect DB ");

	}

}
