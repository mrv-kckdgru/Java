package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		KrediUI krediUI=new KrediUI();
		krediUI.krediHesapla(new OgretmenKrediManager());

	}

}
