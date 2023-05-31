package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngExample {

	
@BeforeClass
public void f() {
	System.out.println("testing");
}
		
@Test
public void test1() {
	System.out.println("Testing test case1");
}

}
