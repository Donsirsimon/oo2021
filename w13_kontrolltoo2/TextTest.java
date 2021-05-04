import org.junit.*;
import static org.junit.Assert.*;
public class TextTest{
	Text t1 = new Text("pere");
	Sentence s1 = new Sentence("palju sõnu meil on lauses");
	
	@Test
	public void esimene(){
		
		assertEquals(0, t1.count('a'));
	}
	@Test
	public void teine(){
		
		assertEquals(1, t1.count('p'));
	}
	@Test
	public void kolmas(){
		
		assertEquals(2, t1.count('e'));
	}
	@Test
	public void neljas(){
		
		assertEquals(2, s1.count('a'));
	}
	@Test
	public void viies(){
		
		assertEquals(2, s1.count2('a'));
	}
}	


