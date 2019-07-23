package Training.src.TestNGGroupsDataProviderXML;

import org.testng.annotations.Test;

public class Test1  
{

@Test(groups={"Sanity","Reg"})
public void TC01_A()
{
	System.out.println("A method");
}

@Test(groups={"Reg"})
public void TC01_B()
{
	System.out.println("B method");
}

@Test(groups={"Reg"})
public void TC01_C()
{
	System.out.println("C method");
}

@Test(groups={"Sanity"})
public void TC01_D()
{
	System.out.println("D method");
}

}
