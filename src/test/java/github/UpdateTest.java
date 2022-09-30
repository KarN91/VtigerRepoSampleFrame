package github;

import org.testng.annotations.Test;

public class UpdateTest 
{

	@Test(groups={"regression"})
public void openbrowser() 
{
	System.out.println("------open the browser-----");
}

	@Test(groups={"smoke"})
public void login() 
{
	System.out.println("-----login to the appl-----");
}

	@Test(groups={"smoke"})
public void createcontact() {
	System.out.println("----create contact-----");
}
}
