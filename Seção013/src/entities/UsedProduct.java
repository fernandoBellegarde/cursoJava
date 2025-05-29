package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	
	private LocalDate manufecteredDate;
	
	public UsedProduct(){
		super();
	}

	public UsedProduct(String name, Double price, LocalDate date) {
		super(name, price);
		this.manufecteredDate = date;
	}

	public LocalDate getDate() {
		return manufecteredDate;
	}

	public void setDate(LocalDate date) {
		this.manufecteredDate = date;
	}
	
	@Override
	public String priceTag() {
		return getName()
				+" (used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufecteredDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +  ")";
				
	}

}
