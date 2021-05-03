import java.util.*;
public class Roopyhendus extends Tarbija{
    List<Tarbija> hoidla=new ArrayList<Tarbija>();
    public void lisa(Tarbija t){hoidla.add(t);}
	
    public double kysiTakistus(){
        if(hoidla.size()==0){return 1000000000;}
        double juhtivus=0;
        for(Tarbija t: hoidla){
            juhtivus+=1.0/t.kysiTakistus();
        }
        return 1.0/juhtivus;
    }
    public double kysiMaxPinge(){
        double maxPinge=1000000000;
        if(hoidla.size()==0){return maxPinge;}
        for(Tarbija t: hoidla){
            double mp=t.kysiMaxPinge();
            if(mp<maxPinge){
               maxPinge=mp;  
            }
        }
        return maxPinge;
    }
    public double kysiMaxVoimsus(){
        return kysiMaxPinge()*kysiVool(kysiMaxPinge());
    }
}