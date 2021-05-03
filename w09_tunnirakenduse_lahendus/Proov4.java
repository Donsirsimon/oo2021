public class Proov4{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Juhib");
        } else {
            System.out.println("Ei juhi");
        }
    }
    public static void main(String[] arg){
        Lyliti lylitia=new Lyliti();
		Lyliti lylitib=new Lyliti();
		Lyliti lylitic=new Lyliti();
		Lyliti lylitid=new Lyliti();
		Lyliti lylitie=new Lyliti();
		Lyliti lylitif=new Lyliti();
		Lyliti lylitim=new Lyliti();
		Lyliti lylitin=new Lyliti();
		
		
		lylitia.seisund(false);
		lylitib.seisund(false); 
		lylitid.seisund(false); 
		lylitie.seisund(false); 
		lylitif.seisund(false); 
		lylitim.seisund(false); 
		lylitin.seisund(false); 
		
		Roopyhendus roopmn=new Roopyhendus();
		roopmn.lisa(lylitim);
		roopmn.lisa(lylitin);
		
		
		
		Jadayhendus jadaefmn=new Jadayhendus();
		jadaefmn.lisa(lylitie);
		jadaefmn.lisa(lylitif);
		jadaefmn.lisa(roopmn);
		
		Jadayhendus jadadf=new Jadayhendus();
		jadadf.lisa(lylitic);
		jadadf.lisa(lylitid);
		
		Roopyhendus roopcdefmn=new Roopyhendus();
		roopcdefmn.lisa(jadadf);
		roopcdefmn.lisa(jadaefmn);
		
		Jadayhendus jadabcdefmn=new Jadayhendus();
		jadabcdefmn.lisa(lylitib);
		jadabcdefmn.lisa(roopcdefmn);
		
		Roopyhendus roopabcdefmn=new Roopyhendus();
		roopabcdefmn.lisa(lylitia);
		roopabcdefmn.lisa(jadabcdefmn);
		
		kuvaOlek(roopabcdefmn);
		
        lylitia.seisund(true);
		kuvaOlek(roopabcdefmn);
		
		
		
		lylitia.seisund(false);
		kuvaOlek(roopabcdefmn);
		
		lylitib.seisund(true);
		lylitie.seisund(true);
		lylitif.seisund(true);
		lylitim.seisund(true);
		kuvaOlek(roopabcdefmn);
		
		
		lylitif.seisund(false); 
		kuvaOlek(roopabcdefmn);

		
		
    }
}