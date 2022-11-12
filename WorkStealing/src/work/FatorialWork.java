package work;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.Callable;

public class FatorialWork implements Callable<BigDecimal>{
	private int number;

	public FatorialWork(int number) {
		this.number = number;
	}
	/*
	 * retorna o valor calculado de um termo
	 * */
	public BigDecimal call() {
		BigDecimal fat = (fatorial(this.number));

		return (BigDecimal.valueOf(1).divide(fat, 200, RoundingMode.HALF_UP));
	}

	/*
	 * calcula o fatorial de um termo
	 * */
	public BigDecimal fatorial(int x) {
		BigDecimal valor = BigDecimal.ONE;
        for (int i = 1; i < x; i++) {
        	valor = valor.multiply(BigDecimal.valueOf(i));
        }
        return valor;
    }

}
