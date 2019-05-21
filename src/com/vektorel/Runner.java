package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println("1. Adim");
		DBISLEM db = new DBISLEM(); //Nesne turetme ve bir degiskene(db) atama islemi.
		System.out.println("2. Adim");
		db.kaydet();
		System.out.println("3. Adim");
		
		tblmusteri mst = new tblmusteri(); //assagidaki kod ile bu kod ayni islem yapiyor.
		mst.id = 123;
		mst.ad = "Ibrahim";
		mst.adres = "Ankara";
		mst.yazdir();
		
		tblmusteri mst2 = new tblmusteri(321, "Ipek", "Aydin"); //bu daha az kod yeri kapladigi icin bu daha iyi.
		mst2.yazdir();
		
		
	}

}
