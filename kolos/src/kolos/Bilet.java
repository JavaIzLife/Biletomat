package kolos;


//dziala ? klasa bazowa do drukarki, w klasie pochodnej wywolac konstruktor, dodac 2 inne klasy ksero i skaner, klasa bazowa urzadzenie wielofunkcyjne, wlaczenie i wylaczenie to metody do wszystkich, przesloniecie metody w klasie pochodnej, bo inaczej dla kazdego z podurzadzen, poziom tuszu tonera, ile wydrukowanych ile zeskanowanych, klasa bazowa w innym pakiecie i reszta w innym
public class Bilet {
	
	int cenaBilet;
	String dataBilet;
	String rodzajBilet;
	
	
	Bilet(int c, String d, String r){
		cenaBilet=c;
		dataBilet=d;
		rodzajBilet=r;
	}
	

	
}


class BiletNormalny extends Bilet{
	 BiletNormalny(String d) {
		super(2,d,"Normalny");
	}
}

class BiletUlgowy extends Bilet{
	 BiletUlgowy(String d) {
		super(1,d,"Ulgowy");
	}
}