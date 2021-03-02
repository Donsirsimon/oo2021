/*Algarvud

· Teata, kas kasutaja sisestatud arv jagub kahe, kolme viie või seitsmega.
· Teata, kas kasutaja sisestatud arv on algarv.
· Koosta massiiv esimese tuhande algarvuga. 
Leia selle sõela abil, millised on kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut.

*/

import java.io.*;
import java.util.*;
public class Kt{

   
	
	
	public static void kasJagub (int sisend){
		int number = sisend;
		if (number % 2 == 0){
			System.out.println("Number "+number+" jagub kahega");
		}	
		if (number % 3 == 0){
			System.out.println("Number "+number+" jagub kolmega");
		}	
		if (number % 5 == 0){
			System.out.println("Number "+number+" jagub viiega");
		}
		if (number % 7 == 0){
			System.out.println("Number "+number+" jagub seitsmega");
		}	
		
		
	}	
	
	
	
	
	public static void kasAlgarv2 (int sisend){
		int number = sisend;
		boolean test = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				test = true;
				break;
			}
		}
		if(test == false){
			System.out.println("Number "+number+" on algarv!");
		}	
		if(test == true){
			System.out.println("Number "+number+" ei ole algarv!");
		}
	}
	
	
	public static void main(String[] args){	
	
		Scanner input = new Scanner(System.in);
			System.out.print("Sisesta number: ");
			Integer nr = input.nextInt();
			kasJagub(nr);
			kasAlgarv2(nr);
			Massiiv algarvud = new Massiiv();
			
			algarvud.galgarvud();
			System.out.println();
		
		
	}
}	