public class Joogivaat{
	
	double ruumala;
	double liitrid;
	
	
	String nimi;
	double erikaal;
	double liitrihind;
	Jook vaadis;
	
	public Joogivaat(double ruum){
		ruumala = ruum;
		//liitrid = l;
	}
	public void lisaJook(Jook jook, double kogus){
		if(kogus+liitrid<ruumala){
			vaadis= jook;
			this.nimi=jook.nimi;
			this.erikaal=jook.erikaal;
			this.liitrihind= jook.liitrihind;
			liitrid += kogus;
		}	
	}			
	public String taidaPudel(Joogipudel pudel){
		if(liitrid >= pudel.maht){
			pudel.lisaJook(vaadis);
			liitrid -=pudel.maht;
			return "pudel täidetud";
		}
		return "pole piisavalt jooki";	
	}	
		
	public double paljuVaadis(){
		return liitrid;
	}	
	
	public int pudeldaVaat(Joogipudel pudel){
		int mitu = 0;
		while(liitrid >= pudel.maht){
			pudel.lisaJook(vaadis);
			liitrid -=pudel.maht;
			mitu ++;
		}
		return mitu;
	} 
}		
		
		
		
		
		
		
		
//Koosta klass Joogivaat, millel on ruumala ning sees oleva Joogi kogus liitrites. 
//Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). K		