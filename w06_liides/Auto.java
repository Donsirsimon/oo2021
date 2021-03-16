class Auto implements Liiklusvahend{
	 double kiirus=0;
	
	public Auto(double v){
		kiirus = v;
	}
	public void muudaKiirus(double v){
		kiirus = v;
	}
	public double kysiAeg(double vahemaa){
		double aeg = vahemaa / kiirus;
		double aegMinutites = aeg * 60;
		if (kiirus > 90){aegMinutites += 30;}
		return aegMinutites;
	}
	
	
	
}