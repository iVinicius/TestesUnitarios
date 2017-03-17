/**
 * 
 */
package contaMagica;

import java.math.BigDecimal;

/**
 * @author 14108849
 *
 */
public class ContaMagica implements IContaMagica {
	
	private String nome;

	public ContaMagica(String nome){
		this.nome = nome;
	}
	
	@Override
	public String getNomeCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categorias getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deposito(BigDecimal valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retirada(BigDecimal valor) {
		// TODO Auto-generated method stub

	}
}