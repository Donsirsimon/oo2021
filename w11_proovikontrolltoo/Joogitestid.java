import org.junit.*;
import static org.junit.Assert.*;
public class Joogitestid{
	Jook  j1 = new Jook("vesi", 2, 1);
	Joogipudel p1= new Joogipudel(2, "plastik", 0.5, 1.0);
	Joogivaat v1= new Joogivaat(20);
	
	@Test
	public void esimene(){
		p1.lisaJook(j1);
		assertEquals(2.5, p1.joogigaMass(),0.01);
	}
	@Test
	public void teine(){
		p1.lisaJook(j1);
		assertEquals(5, p1.omaHind(), 0.01);
	}
	@Test
	public void kolmas(){
		v1.lisaJook(j1, 10);
		assertEquals(10, v1.paljuVaadis(), 0.01);
	}
	@Test
	public void neljas(){
		v1.lisaJook(j1, 10);
		assertEquals(5, v1.pudeldaVaat(p1), 0.01);
		assertEquals(0, v1.paljuVaadis(), 0.01);
		
	}
}	