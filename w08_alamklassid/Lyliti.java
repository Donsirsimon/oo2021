public class Lyliti extends Tarbija implements Lylitatav{
    boolean yhendatud;
    public Lyliti(){
        super();
    }
    public void seisund(boolean sees){yhendatud=sees;}
    public double kysiTakistus(){
        if(yhendatud){return 0.0001;}
        return 1000000000;
    }
    public double kysiMaxVoimsus(){return 3;}
}