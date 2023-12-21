package Bolum_003_sekiller;

public class Geometri extends Sekil{

	public Geometri()
	{
		
	}
	public void sekilCiz(Sekil sekil) {
		System.out.println(sekil.toString()+" Geometri sınıfının içinde şekil çiziyorsunuz...");
	}
	public void sekilSil(Sekil sekil) {
		System.out.println(sekil.toString()+" Geometri sınıfının içinde şekil siliyorsunuz...");
	}
	@Override
	public void sil() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ciz() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double alanHesapla() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double cervreHesapla() {
		// TODO Auto-generated method stub
		return 0;
	}
}
