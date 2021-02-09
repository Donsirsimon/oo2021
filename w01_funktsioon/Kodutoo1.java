import java.util.Scanner;

public class Kodutoo1{
	//funktsioon arvutab pangahoiuse sissemaksest ja kuumaksest koos intressiga välja aja, millega saab arvele kogutud soovitud summa.
	public static double kuuIntress(double aastaIntress){
		return aastaIntress / 12;
	}	
	
	public static int[] kauaKoguma(double sisseMakse, double kuuMakse, double loppSumma){
		double aastaIntress = 0.0055;
		double kontol = sisseMakse;
		int loendur = 0;
		while (kontol < loppSumma){
			double intressiSumma = kontol * kuuIntress(aastaIntress);
			kontol = kontol + kuuMakse + intressiSumma;	
			loendur = loendur + 1;
		}	
			
		int aastad = loendur / 12 ;
		int kuud = loendur - aastad * 12;
		int[] tulemused = new int[2];			
		tulemused[0] = aastad;
		tulemused[1] = kuud;
	
		return tulemused;
			
	}
	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sisesta esimese sissemakse summa: ");
        double sisseMakse = input.nextDouble();

        System.out.print("Sisesta kuumakse suurus: ");
        double kuuMakse = input.nextDouble();
		
		System.out.print("Sisesta palju tahad lõpuks kokku koguda: ");
        double loppSumma = input.nextDouble();
		
		int[] tulemused = kauaKoguma(sisseMakse, kuuMakse, loppSumma);
        
	System.out.printf("Summa %.2f kokku saamiseks kulub %d aastat ja %d kuud.",loppSumma,tulemused[0],tulemused[1]);
		}	
    }    

