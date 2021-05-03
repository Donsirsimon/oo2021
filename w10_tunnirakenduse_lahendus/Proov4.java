public class Proov4{
    public static void main(String[] arg){
        Puhver<Integer, Integer> p1=new Puhver<Integer, Integer>(new RuuduArvutaja());
		 
		
        System.out.println(p1.arvuta(3));
        System.out.println(p1.arvuta(5));
        System.out.println(p1.arvuta(3));
        System.out.println(p1.hoidla);
		
		
		Puhver<String, String> p2=new Puhver<String, String>(new Tekstidubleerija());
		System.out.println(p2.arvuta("Tere"));
		System.out.println(p2.arvuta("auh"));
		
		
		Puhver<String, String> p3=new Puhver<String, String>(new Tekstikorrutaja(3));
		System.out.println(p3.arvuta("Tere"));
		System.out.println(p3.arvuta("auh"));
		
		Puhver<String, String> p4=new Puhver<String, String>(new Tekstikorrutaja(4));
		System.out.println(p4.arvuta("Tere"));
		
		Puhver<String, String> p5=new Puhver<String, String>(new Tekstipööraja());
		System.out.println(p5.arvuta("ereT"));
		System.out.println(p5.arvuta("amelo idiptegiõ düün skaeP"));
		
    }
}



/*
 Koostage Arvutaja, mis tagastab iga teksti kahekordselt
   (lisaülesanne - kordade arv antakse ette konstruktoris)
 Katsetage peaprogrammis koos puhvriga
*/