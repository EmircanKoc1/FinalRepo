package tr.edu.medipol.yova;

import java.util.ArrayList;

public class ArdahanSecimApi {

	private  Parti partiA ;
	private  Parti partiB ;
	private  Parti partiC ;
	
	public ArdahanSecimApi(){
		
		partiA = new Parti();
		partiB = new Parti();
		partiC = new Parti();
		
		partiA.partiAdi = "A";
		partiB.partiAdi = "B";
		partiC.partiAdi = "C";
	
		
	}
	
	public boolean partiOyArttir(String partiAdi) {
		boolean state = false;
		
		switch (partiAdi) {
		case "A" :
			partiA.partiOySayisi++;
			state = true ;
			break;
			
		case "B" :
			partiB.partiOySayisi++;
			state = true ;
			break;
		
		case "C" :
			partiC.partiOySayisi++;
			state = true;
			break;
		}
		
		return state;
		
	}
	
	public boolean partiOyAzalt(String partiAdi) {
		
		boolean state = true;
		
		if(partiAdi.equals("A")) {
			if(partiA.partiOySayisi > 0) 
				partiA.partiOySayisi--;
			else
				state = false;
		}
		else if(partiAdi.equals("B")) {
				if(partiB.partiOySayisi > 0) 
				partiB.partiOySayisi--;
			else
				state = false;
		}
		else if(partiAdi.equals("C")) {
				if(partiC.partiOySayisi > 0) 
				partiC.partiOySayisi--;
			else
				state = false;
		}
		else
			state = false;
		
		return state;
	}
	
	public int partiOyGetir(String partiAdi) {
		int value ;
		switch (partiAdi) {
		case "A": 
			value = partiA.partiOySayisi;
			break;
		case "B": 
			value = partiB.partiOySayisi;
			break;
		case "C": 
			value = partiC.partiOySayisi;
			break;
		default:
			value = -1;
			break;
		}
		return value ;
	}

	public ArrayList<Parti> partiOyListele(){
		ArrayList<Parti> partiVeOylar = new ArrayList<Parti>();
		
		partiVeOylar.add(partiA);
		partiVeOylar.add(partiB);
		partiVeOylar.add(partiC);
		
		return partiVeOylar;
	}

	
}
