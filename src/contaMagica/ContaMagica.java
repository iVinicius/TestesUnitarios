/**
 * 
 */
package contaMagica;

import java.math.BigDecimal;
import java.math.MathContext;

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
		status = Categorias.SILVER;
		saldo = new BigDecimal(0);
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
		if(valor.longValue() < 0){
			return;
		}
		saldo = saldo.add(valor.multiply(this.status.getBonus(), new MathContext(4)));
		
		this.statusCheck();
	}

	@Override
	public void retirada(BigDecimal valor) {
		if(valor.longValue() > saldo.longValue() || valor.longValue() < 0){
			return;
		}
		saldo.subtract(valor);
		
		this.statusCheck();
	}
	
	private void statusCheck(){
		if(saldo.longValue() < 50000){
			status = Categorias.SILVER;
		} else if (saldo.longValue() < 200000){
			status = Categorias.GOLD;
		} else{
			status = Categorias.PLATINUM;
		}			
	}	
}