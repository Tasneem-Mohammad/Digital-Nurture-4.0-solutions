package ecommercePlatformSearchFunction;

public class Product {
	int productId;
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	String productName;
	String category;
	
	public Product(int productId,String productName,String category) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}
	
	@Override
	public String toString() {
	    return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
	}

}

class SearchAlgorithms{
	public static Product linearSearch(int productId ,Product[] products) {
		// linear search - O(n)
		for(int i=0;i<products.length;i++) {
			if(products[i].productId == productId) {
				return products[i];
			}
		}
		return null;
	}
	public static Product binarySearch(int productId ,Product[] products) {
		// binary search - O(log n)
		int low = 0;
		int high = products.length-1;
		while(low <= high) {
			int mid = low +(high-low)/2;
			
			if(products[mid].getProductId() == productId) {
				return products[mid];
			}else if(products[mid].getProductId() < productId) {
				low  = mid+1;
			}else {
				high = mid-1;
			}
		}
		return null;
	}
}

class Main{
public static void main(String[] args) {
	Product p1 = new Product(1,"Product1" , "clothes");
	Product p2 = new Product(2,"Product2" , "shoes");
	Product p3 = new Product(3,"Product3" , "glasses");
	Product p4 = new Product(4,"Product4" , "shirts");
	
	Product[] array = {p4, p2, p1, p3};
	Product[] sortedArray = {p1 , p2 , p3 , p4};
	
	
	Product result1 = SearchAlgorithms.linearSearch(4, array);
	if(result1 != null) {
		System.out.println("Element found : "+ result1);
	}else {
		System.out.println("Element is not found");
	}
	
	Product result2 = SearchAlgorithms.linearSearch(6, array);
	if(result2 != null) {
		System.out.println("Element found : "+ result2);
	}else {
		System.out.println("Element is not found");
	}
	
	Product result3 = SearchAlgorithms.binarySearch(3, sortedArray);
	if (result3 != null) {
		System.out.println("Element found : "+ result3);
	}else {
		System.out.println("Element is not found");
	}
	
	Product result4 = SearchAlgorithms.binarySearch(5, sortedArray);
	if (result4 != null) {
		System.out.println("Element found : "+ result4);
	}else {
		System.out.println("Element is not found");
	}
  }	
	
}