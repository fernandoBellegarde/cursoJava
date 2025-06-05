package entities;

public class PhysicalPerson extends Tax{
	
	private Double healthExpend;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double rendaAnual, Double healthExpend) {
		super(name, rendaAnual);
		this.healthExpend = healthExpend;
	}

	public Double getHealthExpend() {
		return healthExpend;
	}

	public void setHealthExpend(Double healthExpend) {
		this.healthExpend = healthExpend;
	}

	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - healthExpend * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - healthExpend * 0.5;
		}
	}

}
