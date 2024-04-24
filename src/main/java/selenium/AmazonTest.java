package selenium;

public class AmazonTest {

	public static void main(String[] args) {
String browser ="chrome";

BrowserUtil brUtil = new BrowserUtil();
brUtil.launchBrowser(browser);
brUtil.launchURL("https://www.amazon.com");
String actTitle = brUtil.getPageTitle();
if(actTitle.contains("Amazon")) {
	System.out.println("title PASS");
}
else {
	System.out.println("title FAIL");

}
String url = brUtil.getPageURL();
if(url.contains("amazon.com")) {
	System.out.println("URL pass");
}
else {
	System.out.println("URL FAIL");

}
brUtil.closeBrowser();


	}

}
