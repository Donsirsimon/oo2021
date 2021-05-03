public class Takisti extends Tarbija{
    double r, maxN;
	public Takisti(double r, double maxN){
		this.r=r; this.maxN=maxN;
	}
	public double kysiTakistus(){
		return r;
	}
	public double kysiMaxVoimsus(){
		return maxN;
	}
}