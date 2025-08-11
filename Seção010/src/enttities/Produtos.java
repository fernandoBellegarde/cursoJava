package enttities;

public class Produtos {

	private Integer idProduct;
	private String nameProduct;
	private Double priceProduct;
	private Integer quantityStock;

	public Produtos(int idProduct, String nameProduct, double priceProduct, int quantityStock) {
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.quantityStock = quantityStock;
	}

	public int getIdProduct() {
	   return idProduct;	
	}
	
	public String getNameProduct() {
		return nameProduct;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public int getQuantityStock() {
		return quantityStock;
	}

	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}

	public void updatePrice(double newPrice) {
		this.priceProduct = newPrice;
	}

	
	public String toString() {
		return " | Name: " 
			+ nameProduct	
			+ " |  price: "
			+ String.format("%.2f", priceProduct) 
		    +" |  quantity: "
		    + quantityStock;
	}

}
