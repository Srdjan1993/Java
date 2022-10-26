import java.util.Random;
import java.util.Scanner;

public class SkockoClass {


	static final int brojPolja = 4;
	static final int brojZnakova = 6;
	static final int brojPoteza = 7;
	public int[] clanovi;
	
	public int znak;
	

	
	//metoda za ispisvanje
	
	/*public void ispisiSkocka() {
		
		for(int i = 0; i<brojPolja;i++) {
			System.out.println(clanovi[i]+"");
		}
		
	}
	*/
	
	private void generisiSkocka() {
		Random r = new Random();
		clanovi = new int[brojPolja];
		for(int i = 0; i < brojPolja; i++) {
			clanovi[i]= r.nextInt(brojZnakova)+1;
			System.out.println(clanovi[i]);
		}
			
	}
	
	
	
	//metoda za ucitavanje
	
	public void ucitajSkocka() {
        Scanner scanner = new Scanner(System.in);
		
        generisiSkocka();
          
	   
	     System.out.println("Pocela igra skocko");
	     
	     
	     
	   boolean nizTacnihPolja[];
	   nizTacnihPolja = new boolean[brojPolja];
	     
	        
	     for(int j = 0; j < brojPoteza;j ++) {
	    	  
	    	 
	    	 
	    	for(int i = 0; i < brojPolja;i++) {
	    		System.out.println("Unesite "+(i+1)+". znak : ");
		    	
	    		int zank ;
	    		znak = scanner.nextInt();
	    		
	    		
		    	if(znak == clanovi[i]) {
		    		
		    		System.out.println("Pogododili ste!");
		    	    nizTacnihPolja[i]= true;
		    	}
		    	
		    	else {
					System.out.println("Niste pogodili!");	
					nizTacnihPolja[i] = false;
				}
	    		
	    	}
	    	
	    for(int k = 0; k<brojPolja;k++) {
	    	
	    	if	(nizTacnihPolja[k]== true ) {
	    		
	    		System.out.println("Pogodak znaka na poziciji"+k);
	    	
	    	}
	    	
	    	else {
				
			}
	    }	
	    	
	    	
	    	
	     }
	     
	     }
	     
	

	
}
