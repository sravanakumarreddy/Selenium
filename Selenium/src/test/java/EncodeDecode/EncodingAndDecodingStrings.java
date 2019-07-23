package EncodeDecode;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;

public class EncodingAndDecodingStrings {
	
	@Test
	void demo()
	{
		String str="test123";
		
		byte[] encodedString=Base64.encodeBase64(str.getBytes());
		
		System.out.println("encoded string :"+new String(encodedString));
		
		
		byte[] decodeString = Base64.decodeBase64(encodedString);
		
		System.out.println("encoded string :"+new String(decodeString));
	}

}
