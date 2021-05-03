public abstract class Tarbija{
	public abstract double kysiTakistus();
	public abstract double kysiMaxVoimsus();
	public double kysiVool(double pinge){
		return pinge/kysiTakistus();
	}
	public double kysiMaxPinge(){
        return Math.sqrt(kysiTakistus()*kysiMaxVoimsus());
    }
    public boolean kasLubatudPinge(double pinge){
     if(pinge>kysiMaxPinge()){return false;}
     return true;   
    }
    public boolean kasLubatudVool(double vool){
       double pinge=vool*kysiTakistus();       
      return kysiMaxVoimsus()>=pinge*vool;
    }
}