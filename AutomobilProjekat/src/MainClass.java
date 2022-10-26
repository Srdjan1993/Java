
public class MainClass {

	public static void main(String[] args) {

		Motor m1 = new Motor(2000, 120, "dizel");
		Motor m2 = new Motor(1600, 140, "benzin");
		Motor m3 = new Motor(3000, 220, "dizel");
		
		Automobil a1 = new Automobil("A4", "Audi", "2014", "BG-5555-US", (byte)5, "bela", m1);
		
		Automobil a2 = new Automobil("C klasa", "Mercedes", "1999", "", (byte)4, "zuta", m2);
		
		Automobil a3 = new Automobil("m5", "BMW", "2017", "NS-5555-NH",(byte) 5, "crna", m3);
		
		
		a1.ofarbaj("crvena");
		
		a2.povecajSnaguMotora(50);
		
		a3.registrujKola("NS-7777-OS");
		
		
		System.out.println(a1.boja);
		System.out.println(a2.motor.jacina);
		System.out.println(a3.regTablica);
	}

}
