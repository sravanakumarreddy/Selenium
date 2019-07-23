package Training.src.TestNGGroupsDataProviderXML;

import org.testng.annotations.DataProvider;

public class Data 
{

@DataProvider
public Object[][] LoginValidation()
{
	return new Object[][] 
			{
			{" "," "},
			{"aaaaa","aaaa"},
			{"sdasda@com","12345"}			
			};
}
}
