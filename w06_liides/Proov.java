import java.lang.Math;

public class Proov{
	public static void main(String[] arg){
		Jalgratas minuJalgratas = new Jalgratas(14);
		Auto z4 = new Auto(140);
		Auto lada = new Auto(75);
		
		
		System.out.println();
		System.out.println("Jalgrattaga sõidab Tallinna "+Math.round(minuJalgratas.kysiAeg(100))+" minutit");
		System.out.println("Z4-ga sõidab Tallinna "+Math.round(z4.kysiAeg(100))+" minutit.");
		System.out.println("Lada-ga sõidab Tallinna "+Math.round(lada.kysiAeg(100))+" minutit.");
		z4.muudaKiirus(90);
		System.out.println();
		System.out.println("Kui Z4 muudab oma kiiruseks 90kmh:");
		System.out.println("Z4-ga sõidab Tallinna "+Math.round(z4.kysiAeg(100))+" minutit.");
	
	
	
	
	
	}
}	