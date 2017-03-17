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
	
	private Categorias status;
	
	private BigDecimal saldo;

	public ContaMagica(String nome){
		this.nome = nome;
	}
	
	@Override
	public String getNomeCliente() {
		return nome;
	}

	@Override
	public BigDecimal getSaldo() {
		return saldo;
	}

	@Override
	public Categorias getStatus() {
		return status;
	}

	@Override
	public void deposito(BigDecimal valor){
		if(valor.longValueExact() < 0){
			return;
		}
		saldo.add(valor);
	}

	@Override
	public void retirada(BigDecimal valor) {
		if(valor.longValueExact() > saldo.longValueExact() || valor.longValueExact() < 0){
			return;
		}
		saldo.subtract(valor);
	}
}