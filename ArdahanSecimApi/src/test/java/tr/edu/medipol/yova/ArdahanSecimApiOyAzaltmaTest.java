package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArdahanSecimApiOyAzaltmaTest {

	@Test
	public void testAPartiOyAzaltmaSifirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("A");
		 
		
		assertEquals(false,durum);
		
	}
	
	@Test
	public void testAPartiOyAzaltmaBirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("A");
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("A");
		 
		
		assertEquals(true,durum);
		
	}
	
	@Test
	public void testBPartiOyAzaltmaSifirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("B");
		 
		
		assertEquals(false,durum);
		
	}
	
	@Test
	public void testBPartiOyAzaltmaBirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("B");
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("B");
		 
		
		assertEquals(true,durum);
		
	}
	
	@Test
	public void testCPartiOyAzaltmaSifirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("C");
		 
		
		assertEquals(false,durum);
		
	}
	
	@Test
	public void testCPartiOyAzaltmaBirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("C");
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("C");
		 
		
		assertEquals(true,durum);
		
	}
	
	@Test
	public void testOlmayanPartiOyAzaltmaSifirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("X");
		 
		
		assertEquals(false,durum);
		
	}
	
	@Test
	public void testOlmayanPartiOyAzaltmaBirOy() {
		
		
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("X");
		boolean durum ;
		
		
		 durum = obj.partiOyAzalt("X");
		 
		
		assertEquals(false,durum);
		
	}


}
