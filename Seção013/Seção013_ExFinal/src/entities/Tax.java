package entities;

public abstract class Tax {
	
	protected String name;
	protected Double rendaAnual;

	
	public Tax() {
	}

	public Tax(String name, Double rendaAnual) {
		this.name = name;
		this.rendaAnual = rendaAnual;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	public abstract Double imposto();

}
