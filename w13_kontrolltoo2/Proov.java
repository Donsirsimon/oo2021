public class Proov{
	public static void main(String[] arg){
		Text t1 = new Text("pere");
		System.out.println("Mitu a tähte?");
		
		System.out.println(t1.count('a'));
		
		System.out.println("Mitu p tähte?");
		
		System.out.println(t1.count('p'));
		System.out.println("Mitu e tähte?");
		
		System.out.println(t1.count('e'));
		
		Sentence s1 = new Sentence("palju sõnu meil on lauses");
		
		System.out.println("Mitu sõna lauses?");
		System.out.println(s1.wordcount());
		
		System.out.println("Mitu a tähte lauses?");
		System.out.println(s1.count('a'));
		
		System.out.println("Mitu a tähte on sõnades ja lauses?");
		System.out.println(s1.count2('a'));
		
		
		System.out.println(s1.kuvaerisonad());
	}
}	

