public class Proov4{
    public static void main(String[] arg){
		Takisti t1=new Takisti(1000, 5);
        Takisti t2=new Takisti(1000, 5);
        Jadayhendus j1=new Jadayhendus();
		System.out.println("Lisan jadaühendusse takisti");
        j1.lisa(t1);
		System.out.println("Takistus:");
        System.out.println(j1.kysiTakistus());
		System.out.println("vool:");
		System.out.println(j1.kysiAhelaVool());
		System.out.println("Võimsus:");
        System.out.println(j1.kysiMaxVoimsus());
		System.out.println("Pinge:");
        System.out.println(j1.kysiMaxPinge());
		System.out.println("Lisan jadaühendusse takisti");
		j1.lisa(t2);
		System.out.println("Takistus:");
		System.out.println(j1.kysiTakistus());
		System.out.println("vool:");
		System.out.println(j1.kysiAhelaVool());
		System.out.println("Võimsus:");
        System.out.println(j1.kysiMaxVoimsus());
		System.out.println("Pinge:");
        System.out.println(j1.kysiMaxPinge());
		Takisti t3=new Takisti(1000, 5);
        Takisti t4=new Takisti(1000, 5);
		System.out.println("Roopyhendus:");
        Roopyhendus r1=new Roopyhendus();
		System.out.println("Lisan Roopyhendusse t3 ja t4:");
        r1.lisa(t3);
        r1.lisa(t4);
		System.out.println("roopyhenduse takistus:");
        System.out.println(r1.kysiTakistus());
		System.out.println("roopyhenduse võimsus:");
        System.out.println(r1.kysiMaxVoimsus());
		System.out.println("roopyhenduse pinge:");
        System.out.println(r1.kysiMaxPinge());
		
		
		System.out.println("Segayhendus kokku:");
		Jadayhendus j2=new Jadayhendus();
		j2.lisa(j1);
		j2.lisa(r1);
		System.out.println("Takistus:");
		System.out.println(j2.kysiTakistus());
		System.out.println("vool:");
		System.out.println(j2.kysiAhelaVool());
		System.out.println("Võimsus:");
        System.out.println(j2.kysiMaxVoimsus());
		System.out.println("Pinge:");
        System.out.println(j2.kysiMaxPinge());
		
		System.out.println("Lisan segaühendusse jadas veel takisti t5:");
		Takisti t5= new Takisti(1000, 5);
		j2.lisa(t5);
			
		System.out.println("Takistus:");
		System.out.println(j2.kysiTakistus());
		System.out.println("vool:");
		System.out.println(j2.ahelaVool());
		System.out.println("Võimsus:");
        System.out.println(j2.kysiMaxVoimsus());
		System.out.println("Pinge:");
        System.out.println(j2.kysiMaxPinge());
		
		System.out.println(j2.kasLubatudPinge(280));
        System.out.println(j2.kasLubatudPinge(300));
        System.out.println(j2.kysiMaxPinge());
		
		
		
	}	
}	