package entities;

public class Product {
	
	private String nameProduct;
	private Double price;
	
	public Product() {
		
	}

	public Product(String nameProduct, Double price) {
		this.nameProduct = nameProduct;
		this.price = price;
	}

	public String getName() {
		return nameProduct;
	}

	public void setName(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	

}
