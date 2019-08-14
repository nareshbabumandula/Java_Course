package oops;

public class ClassB extends ClassA{

	
	public void Login()
	{
		System.out.println("Successfully logged into the application");
	}
	
	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		System.out.println(cb.USERNAME);
		System.out.println(cb.PASSWORD);
		cb.LaunchBrowser();
		cb.AccessSite();
		cb.Login();
		cb.CloseBrowser();
	

	}

}
