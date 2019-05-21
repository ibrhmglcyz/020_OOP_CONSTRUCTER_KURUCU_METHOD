package com.vektorel;

public class DBISLEM {

	// Veritabani islemlerini gerceklestiren bir sinif oldugunu dusunuyoruz.
	
	public DBISLEM() { //Bu blok sinifin ismiyle ayni oldugu icin bir constructur blogudur.
		VT = "ORACLE";
		System.out.println("Constructor Calisti");
	}
	
	public DBISLEM(String VeriTabani) {
		VT = VeriTabani;
		System.out.println("Degisken Tip Constructor Calisti");
	}
	
	private String VT;
	
	public void kaydet() {
		System.out.println("Kayit "+ VT + " Veri tabinina kayit edildi.");
	}
	//public void kaydet(String vs) {}
	
}
