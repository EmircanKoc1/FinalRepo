package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArdahanSecimApiOyListeleme {

	@Test
	public void testOylariListelemeOylarSifirken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(0,list.get(0).partiOySayisi);
		assertEquals(0,list.get(1).partiOySayisi);
		assertEquals(0,list.get(2).partiOySayisi);
		
		
	}
	
	@Test
	public void testOylarıListelemeOylarSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		obj.partiOyArttir("A");
		obj.partiOyArttir("B");
		obj.partiOyArttir("C");
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(1,list.get(0).partiOySayisi);
		assertEquals(1,list.get(1).partiOySayisi);
		assertEquals(1,list.get(2).partiOySayisi);
		
		
	}
	
	@Test
	public void testOylarıListelemeASifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		obj.partiOyArttir("A");
		
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(1,list.get(0).partiOySayisi);
		assertEquals(0,list.get(1).partiOySayisi);
		assertEquals(0,list.get(2).partiOySayisi);
		
		
	}
	
	@Test
	public void testOylariListelemeBSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		obj.partiOyArttir("B");
		
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(0,list.get(0).partiOySayisi);
		assertEquals(1,list.get(1).partiOySayisi);
		assertEquals(0,list.get(2).partiOySayisi);
		
		
	}
	
	@Test
	public void testOylariListelemeCSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		obj.partiOyArttir("C");
		
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(0,list.get(0).partiOySayisi);
		assertEquals(0,list.get(1).partiOySayisi);
		assertEquals(1,list.get(2).partiOySayisi);
		
		
	}
	
	@Test
	public void testOylarıiListelemeAveBSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		obj.partiOyArttir("A");
		obj.partiOyArttir("B");
		
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(1,list.get(0).partiOySayisi);
		assertEquals(1,list.get(1).partiOySayisi);
		assertEquals(0,list.get(2).partiOySayisi);
		
		
	}

	@Test
	public void testOylariListelemeAveCSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		obj.partiOyArttir("A");
		obj.partiOyArttir("C");
		
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(1,list.get(0).partiOySayisi);
		assertEquals(0,list.get(1).partiOySayisi);
		assertEquals(1,list.get(2).partiOySayisi);
		
		
	}

	@Test
	public void testOylariListelemeBveCSifirdanBuyukken() {
		ArdahanSecimApi obj = new ArdahanSecimApi();
		ArrayList<Parti> list = new ArrayList<Parti>();
	
		list = obj.partiOyListele();
		obj.partiOyArttir("C");
		obj.partiOyArttir("B");
		
		
		assertEquals("A",list.get(0).partiAdi);
		assertEquals("B",list.get(1).partiAdi);
		assertEquals("C",list.get(2).partiAdi);
		
		assertEquals(0,list.get(0).partiOySayisi);
		assertEquals(1,list.get(1).partiOySayisi);
		assertEquals(1,list.get(2).partiOySayisi);
		
		
	}


	
	
	
	

	

}
