package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArdahanSecimApiOyGetirme {

	@Test
	public void testAPartiOyGetirmeSifirken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		int oy ;
		
		oy = obj.partiOyGetir("A");
		
		assertEquals(0,oy);
		
	}
	
	@Test
	public void testAPartiOyGetirmeSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("A");
		int oy ;
		
		oy = obj.partiOyGetir("A");
		
		assertEquals(1,oy);
		
	}
	
	@Test
	public void testBPartiOyGetirmeSifirken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		int oy ;
		
		oy = obj.partiOyGetir("B");
		
		assertEquals(0,oy);
		
	}
	
	@Test
	public void testBPartiOyGetirmeSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("B");
		int oy ;
		
		oy = obj.partiOyGetir("B");
		
		assertEquals(1,oy);
		
	}
	
	@Test
	public void testCPartiOyGetirmeSifirken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		int oy ;
		
		oy = obj.partiOyGetir("C");
		
		assertEquals(0,oy);
		
	}
	
	@Test
	public void testCPartiOyGetirmeSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("C");
		int oy ;
		
		oy = obj.partiOyGetir("C");
		
		assertEquals(1,oy);
		
	}
	
	@Test
	public void testOlmayanPartiOyGetirmeSifirken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		int oy ;
		
		oy = obj.partiOyGetir("X");
		
		assertEquals(-1,oy);
		
	}
	
	@Test
	public void testOlmayanPartiOyGetirmeSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		obj.partiOyArttir("X");
		int oy ;
		
		oy = obj.partiOyGetir("X");
		
		assertEquals(-1,oy);
		
	}
	
	
	
	

}
