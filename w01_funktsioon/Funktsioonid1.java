
public class Funktsioonid1 {
	public static double ringiPindala(double r){
		return Math.PI*r*r;
	}	
	public static String temperatuuriHinnang(int t){
		if(t<18){
			return "külm";
		}else{
			return "soe";
		}
	}	
	
	//koostage funktsioon taksosõidu hinna kohta
	//Sisendiks kilomeetrite arv, väljundiks hind
	// sisseistumistasu 3 eurot, kilomeetri hind 80senti.
	public static double taksoHind(double km){
		return(3+km*0.80);
	}
	public static void main(String[] arg){
		System.out.println(ringiPindala(5));
		if(arg.length==1){
			System.out.println(
				temperatuuriHinnang(Integer.parseInt(arg[0])));
		}
		System.out.println(taksoHind(10));		
	}	
}	
