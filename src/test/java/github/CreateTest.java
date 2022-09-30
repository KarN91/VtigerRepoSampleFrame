package github;

import org.testng.annotations.Test;

@Test
public class CreateTest 
{

	@Test(groups={"regression"})
	public void create() 
	{
		System.out.println("----create Lead--------");
	}

	@Test(groups={"smoke"})
public void update() 
{
	System.out.println("update the file");
}

}
