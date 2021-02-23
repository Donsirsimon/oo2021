public class Paberrahatasku{
	
	//myndid
	private int viiesajane;
	private int kahesajane;
	private int sajane;
	private int viiekymnene;
	private int kahekymnene;
	private int kymnene;
	private int viiene;

	
	public Paberrahatasku(int viiesajane, int kahesajane, int sajane, int viiekymnene, int kahekymnene, int kymnene, int viiene){
		this.viiesajane = viiesajane;
		this.kahesajane = kahesajane;		
		this.sajane = sajane;
		this.viiekymnene = viiekymnene;
		this.kahekymnene = kahekymnene;
		this.kymnene = kymnene;
		this.viiene = viiene;

		
	} 
	public double paberrahaSumma(){
		double summa=0;
		
		summa += this.viiesajane * 500;
		summa += this.kahesajane * 200;		
		summa += this.sajane * 100;
		summa += this.viiekymnene * 50;
		summa += this.kahekymnene * 20;
		summa += this.kymnene * 10;
		summa += this.viiene * 5;
	
		
		return summa;
		
		
	}
	public void lisaPaberraha(int viiesajane, int kahesajane, int sajane, int viiekymnene, int kahekymnene, int kymnene, int viiene){
		this.viiesajane += viiesajane;
		this.kahesajane += kahesajane;		
		this.sajane += sajane;
		this.viiekymnene += viiekymnene;
		this.kahekymnene += kahekymnene;
		this.kymnene += kymnene;
		this.viiene += viiene;
		
	}
	public void lisaKahekymnene(int kahekymnene){
		this.kahekymnene += kahekymnene;
	}
	public int[] paberrahaRahakotis(){
		int[] tulemused = new int[7];			
		tulemused[0] = this.viiesajane;
		tulemused[1] = this.kahesajane;
		tulemused[2] = this.sajane;
		tulemused[3] = this.viiekymnene;
		tulemused[4] = this.kahekymnene;
		tulemused[5] = this.kymnene;
		tulemused[6] = this.viiene;
	
		return tulemused;
	} 
}	
	