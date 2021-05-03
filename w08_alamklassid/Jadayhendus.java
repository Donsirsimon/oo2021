import java.util.*;
public class Jadayhendus extends Tarbija{
    List<Tarbija> hoidla=new ArrayList<Tarbija>();
	public void lisa(Tarbija t){hoidla.add(t);}
	
	public double kysiTakistus(){
        if(hoidla.size()==0){return 1000000000;}
		double takistus=0;
        for(Tarbija t: hoidla){
            takistus+=t.kysiTakistus();
        }
        return takistus;
    }
   public double kysiMaxPinge(){
        double maxPinge=1000000000;
        if(hoidla.size()==0){return maxPinge;}
		double mp = 0;
        for(Tarbija t: hoidla){
            mp+=t.kysiMaxPinge();
        }
		if(mp<maxPinge){
			maxPinge=mp;  
        }
        return maxPinge;
    }
	public double kysiAhelaVool(){
		double maxVool=1000000000;
		if(hoidla.size()==0){return maxVool;}
		double mv = 0;
		for(Tarbija t: hoidla){
			mv=t.kysiVool(t.kysiMaxPinge());
            if(mv<maxVool){
               maxVool=mv;  
            }
        }
		return maxVool;
    }
	
	
	public double kysiMaxVoimsus(){
        return kysiMaxPinge()*kysiAhelaVool();
    }	
}	