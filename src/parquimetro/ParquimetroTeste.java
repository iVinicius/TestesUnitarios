/**
 * 
 */
package parquimetro;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 14108849
 *
 */
public class ParquimetroTeste {

	private Parquimetro parq;

	@Before
	public void setUp() throws Exception {
		parq = new Parquimetro();
		parq.insereMoeda(100);
	}

	@Test
	public void testInsereMoeda() {
		parq.insereMoeda(1);
		parq.insereMoeda(5);
		parq.insereMoeda(10);
		parq.insereMoeda(25);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		Assert.assertEquals(291, parq.getSaldo());
	}

	@Test
	public void testGetSaldo() {
		int actual = parq.getSaldo();
		Assert.assertEquals(100, actual);
	}

	@Test
	public void testEmiteTicket() {
		parq.insereMoeda(50);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		boolean actual = parq.emiteTicket();
		Assert.assertEquals(true, actual);
	}

	@Test
	public void testDevolve() {
		parq.insereMoeda(50);
		parq.insereMoeda(50);
		parq.insereMoeda(100);
		parq.emiteTicket();
		int actual = parq.devolve();
		Assert.assertEquals(100, actual);
	}
}