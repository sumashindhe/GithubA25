package Demo;
import org.testng.annotations.Test;

public class DemoTest 
{
	@Test(groups="smoke")
	public void add()
	{
		System.out.println("add");
		System.out.println("sub");
	}
}