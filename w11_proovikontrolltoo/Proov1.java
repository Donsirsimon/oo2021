import java.lang.Math;

public class Proov1{
	public static void main(String[] arg){
		
		Jook  j1 = new Jook("vesi", 2, 1);
		Joogipudel p1= new Joogipudel(2, "plastik", 0.5, 1.0); 
		
		p1.lisaJook(j1);
		
		System.out.println(p1.joogigaMass());
		
		System.out.println(p1.omaHind());
		
		Joogivaat v1= new Joogivaat(20);
		v1.lisaJook(j1, 10);
		System.out.println(v1.paljuVaadis());
		
		System.out.println(v1.taidaPudel(p1));
		
		System.out.println(v1.paljuVaadis());
		
		System.out.println(v1.pudeldaVaat(p1));
		
		System.out.println(v1.paljuVaadis());
		
		Joogikast k1= new Joogikast(20, "plastik", 2, 10);
		
	
	}
}	
		//Jook(String nimetus, double hind, double kaal ){
		//Joogipudel(double pudelimaht, String tyyp, double pudelimass, double hind){	
		//Joogikast(double maht, String tyyp, double kmass, double hind)