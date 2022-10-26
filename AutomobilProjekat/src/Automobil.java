
public class Automobil {

	public String model;
	public String marka;
	public String godiste;
	public String regTablica;
	public byte brojVrata;
	public String boja;
	public Motor motor;
	
	public Automobil() {
		
	}

	public Automobil(String model, String marka, String godiste, String regTablica, byte brojVrata, String boja,
			Motor motor) {
		super();
		this.model = model;
		this.marka = marka;
		this.godiste = godiste;
		this.regTablica = regTablica;
		this.brojVrata = brojVrata;
		this.boja = boja;
		this.motor = motor;
	}
	

	
	public void ofarbaj(String novaBoja) {
		this.boja = novaBoja;
	}
	
	public void registrujKola(String novaRegTablica) {
		this.regTablica = novaRegTablica;
	}
	
	public void povecajSnaguMotora(int snaga) {
		this.motor.jacina = this.motor.jacina + snaga;
	}
	
}
