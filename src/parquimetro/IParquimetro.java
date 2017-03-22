package parquimetro;

public interface IParquimetro {
	// Permite inserir moedas no parquimetro (soma no saldo)
	// Valores poss�veis: 1, 5, 10, 25, 50 e 100 (1 real)
	// Gera InvalidValueException no caso de valor inv�lido
	public void insereMoeda(int valor) throws IllegalArgumentException;

	// Retorna o saldo acumulado no parquimetro
	public double getSaldo();

	// Emite um ticket de 2 reais se houver saldo dispon�vel.
	// Retorna true se a opera��o foi poss�vel
	public boolean emiteTicket();
	// Devolve o saldo existente. Retorna o valor devolvido
}
