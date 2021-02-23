public class Proov1{
	public static void main(String[] arg){
		//Mynditasku(eurone, viiekymnene, kahekymnene, kymnene, viiene, kahene, yhene)
		//Paberrahatasku (viiesajane, kahesajane, sajane, viiekymnene, kahekymnene, kymnene, viiene)
		//Paneme raha esimest korda rahakotti
		Rahakott ken = new Rahakott(0, 0 , 0, 1, 2, 3, 2, 1, 2, 5, 10, 20, 1, 1);
	
		//Arvutame palju rahakotis oleva raha väärtus on
		System.out.println(ken.paljuRaha());
		//Lisame münte münditaskusse
		ken.myndid.lisaMynte(1, 2, 0, 0, 0, 0, 0);
		//Lisame paber raha paberrahataskusse
		ken.paberraha.lisaPaberraha(0, 0, 1, 0, 0, 0, 0);
		//kontrollime palju nüüd raha väärtus on
		System.out.println(ken.paljuRaha());
		//lisame rahataskusse ühe kahekümnese rahatähe.
		ken.paberraha.lisaKahekymnene(1);
		//kogusumma
		System.out.println(ken.paljuRaha());
		//väljastame mis paberrahataskus peidus
		int[] pr = ken.paberraha.paberrahaRahakotis();
		System.out.println("Paberraha rahakotis: 500 - "+pr[0]+", 200 - "+pr[1]+", 100 - "+pr[2]+", 50 - "+pr[3]+", 20 - "+pr[4]+", 10 - "+pr[5]+", 5 - "+pr[6]+"!");
	
	}
}	