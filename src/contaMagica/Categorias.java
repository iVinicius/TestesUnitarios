/**
 * 
 */
package contaMagica;

import java.math.BigDecimal;

/**
 * @author 14108849
 *
 */
public enum Categorias {
	
	SILVER("SILVER", new BigDecimal(1)),
	GOLD("GOLD", new BigDecimal(1.01)),
	PLATINUM("PLATINUM", new BigDecimal(1.025));
	
	private final BigDecimal bonus;
	private final String status;	
	
	Categorias(String status, BigDecimal bonus){ this.status = status; this.bonus = bonus;}

	public BigDecimal getBonus() {
		return bonus;
	}

	public String getStatus() {
		return status;
	}
}