import java.util.ArrayList;
import java.lang.*; 


public class Massiiv{
	int arv;
	
	ArrayList<Integer> algarvud = new ArrayList<Integer>();
	
	
	public void galgarvud(){
		int algarve = 0;
		//if (algarve < 1000){
			for (int i = 2; ; i++) {
				//int test=0;
				if(algarve == 1000){
					break;
				}
				boolean test = false;
				for (int e = 2; e <= i / 2; ++e) {
					if (i % e == 0) {
						test = true;
						break;
					}	
				}
				if(test == false){
					algarvud.add(i);
					algarve += 1;
					System.out.println(i);
					System.out.println(algarve);
				}	
				//if(test == true){
					//System.out.println("Number "+number+" ei ole algarv!");
				//}
			}		
	}
		
}	
		
	
		
		//System.out.println(algarvud);

   


	
