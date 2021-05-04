import java.util.*;
import java.io.FileWriter;
public class Sentence implements LetterCounter{
	String t;
	public Sentence (String tekst){
		this.t = tekst;
		
	}



	public int wordcount(){
		String[] words= this.t.split(" ");
	
		return words.length;
	}
	
	public int count(char taht){
		
		int counter=0;
		for (int i = 0; i < this.t.length(); i++) {
			char cha = this.t.charAt(i);
			if (cha == taht) {
				counter++;
			}
		}	
		return counter;
	}
	public int count2(char taht){
		int sonacounter=0;
		int lausecounter=0;
		String[] words= this.t.split(" ");
		int wordnumber= words.length;
		for (int i = 0; i < wordnumber; i++) {
			sonacounter = 0;
			
			for(int e = 0; e < words[i].length(); e++) {
				char cha = words[i].charAt(e);
				if (cha == taht) {
					sonacounter++;
				}
			}	
			System.out.println(words[i]);
			System.out.println(sonacounter);
			lausecounter = lausecounter + sonacounter;
			
			
		}	
		return lausecounter;
	}
	public List<String> kuvaerisonad(){
		String[] words= this.t.split(" ");
		List<String> strList = new ArrayList<String>();
		int wordnumber= words.length;
		for (int i = 0; i < wordnumber; i++) {
			if(strList.contains(words[i])==false){
				 strList.add(words[i]);
			}
		}
		return strList;
	}
	
}


	
	
	