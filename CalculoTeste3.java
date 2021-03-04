package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		BinaryOperator<Double> calcular = (x, y) -> {return x + y;};
		
		System.out.println(calcular.apply(5.0, 10.0));
		
		calcular = (x, y) -> x * y;
		System.out.println(calcular.apply(5.0, 10.0));
		
	}

}
