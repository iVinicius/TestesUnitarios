/**
 * 
 */
package contaMagica;

import java.math.BigDecimal;

/**
 * @author 14108849
 *
 */
public interface IContaMagica {

	public String getNomeCliente();
	
	public BigDecimal getSaldo();
	
	public Categorias getStatus();
	
	public void deposito(BigDecimal valor);
	
	public void retirada(BigDecimal valor);
	
}