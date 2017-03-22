package parquimetro;

public interface IParquimetro {
	// Permite inserir moedas no parquimetro (soma no saldo)
	// Valores possíveis: 1, 5, 10, 25, 50 e 100 (1 real)
	// Gera InvalidValueException no caso de valor inválido
	public void insereMoeda(int valor) throws IllegalArgumentException;

	// Retorna o saldo acumulado no parquimetro
	public double getSaldo();

	// Emite um ticket de 2 reais se houver saldo disponível.
	// Retorna true se a operação foi possível
	public boolean emiteTicket();
	// Devolve o saldo existente. Retorna o valor devolvido
}
