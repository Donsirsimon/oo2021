import java.lang.*;
import java.util.*;
public class Tekstipööraja implements FunktsiooniLiides<String, String>{
    public String arvuta(String sisend){
		char[] sisse = sisend.toCharArray();
		int algus= 0;
		int lopp=sisse.length-1;
		char malu;
		while(lopp>algus){
			malu=sisse[algus];
			sisse[algus]= sisse[lopp];
			sisse[lopp]= malu;
			lopp--;
			algus++;
		}	
		return new String(sisse);
		
		
       
    }
}

