package hw1.Lesson45.StaticDemo;


public  class ProductValidator {
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}
	
	public  static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty())
		{
			return true;
		}
		return false;
		
	}
	public void bisey() {
		
	}
	
	public static class BaskaBirClass{//inner class
		
	}

}
