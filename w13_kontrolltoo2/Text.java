public class Text implements LetterCounter{
	String t;
	public Text (String tekst){
		this.t = tekst;
		
	}
	
	
	public int count( char taht){
		int counter=0;
		for (int i = 0; i < this.t.length(); i++) {
			char cha = this.t.charAt(i);
			if (cha == taht) {
				counter++;
			}
		}	
		return counter;
	}
}


