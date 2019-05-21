package com.vektorel;

public class tblmusteri {
	
	String ad;
	int id;
	String adres;
	
	public tblmusteri() {}
	
	public tblmusteri(int id, String ad, String adres) {
		
	//this 
		this.id = id;
		this.ad = ad;
		this.adres = adres;
		
		
//		id = no;
//		ad = adi;
//		adres = adresi;
	}
	
	
	public void yazdir() {
		System.out.println("No.......: "+id);
		System.out.println("Ad.......: "+ad);
		System.out.println("Adres....: "+adres);
	}

}
