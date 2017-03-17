/**
 * 
 */
package contaMagica;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author 14108849
 *
 */
public class ContaMagicaTest {
	
	private ContaMagica conta;
	
	@Before
	private void setup(){
		conta = new ContaMagica("Vinicius' Acc");
	}
	
	@Test
	public void testStatusSilver(){
		conta.deposito(new BigDecimal(1000.0));
		Assert.assertEquals(Categorias.SILVER, conta.getStatus());
	}

	@Test
	public void testStatusGold(){
		conta.deposito(new BigDecimal(50000.0));
		Assert.assertEquals(Categorias.GOLD, conta.getStatus());
	}
	
	@Test
	public void testStatusPlatinum(){
		conta.deposito(new BigDecimal(200000.0));
		Assert.assertEquals(Categorias.PLATINUM, conta.getStatus());
	}
	
	@Test
	public void testValorizacaoSilver() {
		conta.deposito(new BigDecimal(1000.0));
		conta.deposito(new BigDecimal(1000.0));
		Assert.assertEquals(new BigDecimal(2000.0), conta.getSaldo());
	}
	
	@Test
	public void testValorizacaoGold() {
		conta.deposito(new BigDecimal(50000.0));
		conta.deposito(new BigDecimal(5000.0));
		Assert.assertEquals(new BigDecimal(55050.0), conta.getSaldo());
	}
	
	@Test
	public void testValorizacaoPlatina() {
		conta.deposito(new BigDecimal(200000.0));
		conta.deposito(new BigDecimal(5000.0));
		Assert.assertEquals(new BigDecimal(205125.0), conta.getSaldo());
	}
	
	@Test
	public void testDepositoSucesso() {
		conta.deposito(new BigDecimal(1000.0));
		Assert.assertEquals(new BigDecimal(1000.0), conta.getSaldo());
	}
	
	@Test
	public void testDepositoFalha() throws Exception{
		conta.deposito(new BigDecimal(-1000.0));
		Assert.fail();
	}
}