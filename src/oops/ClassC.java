package oops;

public class ClassC extends ClassB{

	public void SearchProduct()
	{
		System.out.println("Successfully searched the product");
	}
	
	public void AddToCart()
	{
		System.out.println("Successfully added the product to the cart");
	}
	
	public static void main(String[] args) {
		ClassC cc = new ClassC();
		System.out.println(cc.USERNAME);
		System.out.println(cc.PASSWORD);
		cc.LaunchBrowser();
		cc.AccessSite();
		cc.Login();
		cc.SearchProduct();
		cc.AddToCart();
		cc.CloseBrowser();
		
	}

}
