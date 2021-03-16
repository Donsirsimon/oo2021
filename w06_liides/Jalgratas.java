class Jalgratas implements Liiklusvahend{
	double kiirus=0;
	
	public Jalgratas(double v){
		kiirus = v;
	
	}
	public void muudaKiirus(double v){
		kiirus = v;
	}	
	public double kysiAeg(double vahemaa){
		double v2simus = vahemaa * 0.02;
		double uusKiirus = kiirus - v2simus;
		double aeg = (vahemaa / uusKiirus);
		double aegMinutites = aeg * 60;
		
		return aegMinutites;
	}
}