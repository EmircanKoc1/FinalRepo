package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArdahanSecimApiOyArttirmaTest {

	@Test
	public void testAPartiOyArttirma() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		durum = obj.partiOyArttir("A");
		 
		assertEquals(true,durum);
		
	}
	
	@Test
	public void testBPartiOyArttirma() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		
		 durum = obj.partiOyArttir("B");
		 
		
		assertEquals(true,durum);
		
	}
	
	@Test
	public void testCPartiOyArttirma() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		
		 durum = obj.partiOyArttir("C");
		 
		
		assertEquals(true,durum);
		
	}
	
	@Test
	public void testOlmayanPartiOyArttirma() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		
		 durum = obj.partiOyArttir("X");
		 
		
		assertEquals(false,durum);
		
	}


}
