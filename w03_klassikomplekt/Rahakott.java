public class Rahakott{
	Mynditasku myndid; 
	Paberrahatasku paberraha; 
	
	public Rahakott(int viiesajane, int kahesajane, int sajane, int pviiekymnene, int pkahekymnene, int pkymnene, int pviiene, int eurone, int viiekymnene, int kahekymnene, int kymnene, int viiene, int kahene, int yhene) {
		
		myndid = new Mynditasku(eurone, viiekymnene, kahekymnene, kymnene, viiene,  kahene,  yhene);
		paberraha = new Paberrahatasku( viiesajane, kahesajane, sajane, pviiekymnene, pkahekymnene, pkymnene, pviiene);
		
	}

	
	public double paljuRaha(){
		double summa = 0;
		summa = myndid.myndiSumma() + paberraha.paberrahaSumma();
		
		return summa;
	}
	
	
	

}

