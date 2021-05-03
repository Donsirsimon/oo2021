public class Joogipudel{
	double maht;
	String pudelityyp;
	double mass;
	double taarahind;
	Jook sisu;
	
	
	String nimi;
	double erikaal;
	double liitrihind;
	
	
	public Joogipudel(double pudelimaht, String tyyp, double pudelimass, double hind){
		maht = pudelimaht;
		pudelityyp = tyyp;
		mass= pudelimass;
		taarahind= hind;
	}	
	public void lisaJook(Jook jook){
			this.nimi=jook.nimi;
			this.erikaal=jook.erikaal;
			this.liitrihind= jook.liitrihind;
			
	}		
	public double joogigaMass(){
		double kogumass=0;
		if (nimi!= null){
			kogumass = (maht * this.erikaal) + mass;
			
		}
		return kogumass;	
	}
	public double omaHind(){
		double koguhind=0;
		if (nimi!= null){
			koguhind = (maht * this.liitrihind) + taarahind;
		}
		return koguhind;
	}
	
		
	public double kysiMaht(){
		return maht;	
	}
	public String kysiTyyp(){
		return pudelityyp;
	}
	public double kysiMass(){
		return mass;
	}	
	
	public double kysiTaarahind(){
		return taarahind;
		
	
	}
	public void muudaTaarahind(double hind){
		taarahind = hind;
	}	
}


//Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. Samuti sees olev Jook, mis võib ka puududa. 