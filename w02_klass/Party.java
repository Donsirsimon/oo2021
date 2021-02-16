import java.util.*;
//@SuppressWarnings("unchecked")
public class Party{
	Hashtable<String, String> invited=new Hashtable<String, String>();
	public void invite(String nimi, String status){
		invited.put(nimi, status);	
	}
	
	public String changeStatus(String nimi, String status){
		if(invited.containsKey(nimi)){
			invited.replace(nimi, status);
			return "Status of " +nimi+" has been changed!";
		}else{
			return nimi+" pole peole kutsutud!!!";
		}	
	}
	
	public List goingList(){
		List <String> going = new ArrayList<>();
		String str;
        for (Map.Entry m:invited.entrySet()) { 
			if(m.getValue().equals("+")){
				str = m.getKey().toString();
				going.add(str);
			}	
		}
		return going;
    }      
	
	public int goingNumber(){
		int goingNr = 0;
		for (Map.Entry m:invited.entrySet()) { 
			if(m.getValue().equals("+")){
				goingNr += 1;
		
			}		
		}
		return goingNr;
	}
	
	public double partyBudget(double summa){
		double budget = summa*goingNumber();
		
		return budget;
	}
	
	public Set inviteList() {
		return invited.keySet();
	}
	
	public Hashtable<String, String> inviteStatusList(){
		return invited;
	}		
	
	
}
