public class Tekstikorrutaja implements FunktsiooniLiides<String, String>{
	Integer korrad = 1;
    public Tekstikorrutaja(Integer kordadearv){
		korrad = kordadearv;
	}
	
	
	
	public String arvuta(String sisend){
		String valjund="";
		for(int i=0; i<korrad; i++){
			valjund+=sisend;
			valjund+=" ";
		}
        return valjund;
    }
}


/*
 Koostage Arvutaja, mis tagastab iga teksti kahekordselt
   (lisaülesanne - kordade arv antakse ette konstruktoris)
 Katsetage peaprogrammis koos puhvriga
*/