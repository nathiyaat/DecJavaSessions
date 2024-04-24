package selenium;

import java.util.UUID;

public class StringUtils {

	private StringUtils() {
		
	}
	
	public static String getRandomEmail() {
		//return "auto"+System.currentTimeMillis()+"@"+"opencart.com";
		System.out.println("auto"+UUID.randomUUID());  //auto18a6ca84-ef1e-47eb-943a-253482808346
		System.out.println("auto"+System.currentTimeMillis());

		return "auto"+System.currentTimeMillis()+"@"+"opencart.com";
		//return "auto"+UUID.randomUUID()+"@gmail.com";
		
		//delete from user where email like '%automation%'
		
	}
	
	
}
