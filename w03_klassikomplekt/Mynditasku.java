public class Mynditasku{
	double summa=0;
	//myndid
	private int eurone;
	private int viiekymnene;
	private int kahekymnene;
	private int kymnene;
	private int viiene;
	private int kahene;
	private int yhene;
	
	public Mynditasku(int eurone, int viiekymnene, int kahekymnene, int kymnene, int viiene, int kahene, int yhene){
		this.eurone = eurone;
		this.viiekymnene = viiekymnene;
		this.kahekymnene = kahekymnene;
		this.kymnene = kymnene;
		this.viiene = viiene;
		this.kahene = kahene;
		this.yhene = yhene;
		
	} 
	public double myndiSumma(){
		double summa=0;
		summa += this.eurone;
		summa += this.viiekymnene * 0.5;
		summa += this.kahekymnene * 0.2;
		summa += this.kymnene * 0.1;
		summa += this.viiene * 0.05;
		summa += this.kahene * 0.02;
		summa += this.yhene * 0.01;
		
		return summa;
		
		
	}
	public void lisaMynte(int eurone, int viiekymnene, int kahekymnene, int kymnene, int viiene, int kahene, int yhene){
		this.eurone += eurone;
		this.viiekymnene += viiekymnene;
		this.kahekymnene += kahekymnene;
		this.kymnene += kymnene;
		this.viiene += viiene;
		this.kahene += kahene;
		this.yhene += yhene;
		
	}
	public int[] myndidRahakotis(){
		int[] tulemused = new int[7];			
		tulemused[0] = this.eurone;
		tulemused[1] = this.viiekymnene;
		tulemused[2] = this.kahekymnene;
		tulemused[3] = this.kymnene;
		tulemused[4] = this.viiene;
		tulemused[5] = this.kahene;
		tulemused[6] = this.yhene;
	
		return tulemused;
	} 
	
}