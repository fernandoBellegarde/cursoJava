package entities;

public class IndependentContractor extends Tax{
	
	private Integer numberEmp;
	
	public IndependentContractor() {
		super();
	}

	public IndependentContractor(String name, Double rendaAnual, Integer numberEmp) {
		super(name, rendaAnual);
		this.numberEmp = numberEmp;
	}

	public Integer getNumberEmp() {
		return numberEmp;
	}

	public void setNumberEmp(Integer numberEmp) {
		this.numberEmp = numberEmp;
	}

	@Override
	public Double imposto() {
		if(numberEmp < 10) {
			return getRendaAnual() * 0.16; 
		} else {
			return getRendaAnual() * 0.14;
		}
	}
	
	
}
