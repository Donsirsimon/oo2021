public class Jook{
	String nimi;
	double liitrihind;
	double erikaal;
	public Jook(String nimetus, double hind, double kaal ){
		this.nimi = nimetus;
		this.liitrihind= hind;
		this.erikaal = kaal;
	}
	
	
	public String kysiNimi(){
		return this.nimi;	
	}
	public double kysiLiitrihind(){
		return this.liitrihind;
	}
	public double kysiErikaal(){
		return this.erikaal;
	}
	public void muudaHind(double hind){
		liitrihind = hind;
	}	
		
}




//* Koosta klass Jook, millel on nimetus, liitri omahind ning erikaal. 
