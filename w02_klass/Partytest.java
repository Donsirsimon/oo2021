
public class Partytest{
	public static void main(String[] arg){
		//Erinevad peod
		Party newYear = new Party();
		Party christmas = new Party();
		// Peole kutsumised
		newYear.invite("Ken", "?");
		newYear.invite("Tanel", "?");
		newYear.invite("Annika", "?");
		newYear.invite("Laura", "?");
		newYear.invite("Ago", "?");
		newYear.invite("Teele", "?");
		newYear.invite("Aadu", "?");
		newYear.invite("Peeter", "?");
		newYear.invite("Viljar", "?");
		newYear.invite("Sandra", "?");
		
		christmas.invite("Ken", "?");
		
		System.out.println(" Uusaasta peole kutsutud on:" +newYear.inviteList());
		System.out.println(" Jõulupeole kutsutud on:" +newYear.inviteList());
		
		//Tulijaks märkimine
		System.out.println(newYear.changeStatus("Ken", "+"));
		System.out.println(newYear.changeStatus("Teele", "+"));
		System.out.println(newYear.changeStatus("Ago", "+"));
		System.out.println(newYear.changeStatus("Juku", "+"));
		System.out.println(" ");
		//Kes tulevad peole
		System.out.println("Peole tulijad on:" +newYear.goingList());
		System.out.println(" ");
		//Mitu Inimest tulevad peole
		System.out.println("Peole tulijaid on:" +newYear.goingNumber());
		System.out.println(" ");
		System.out.println(newYear.partyBudget(25));
		System.out.println("Täielik list koos staatustega:");
		System.out.println(newYear.inviteStatusList());
	}
}		