package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		Boolean validar = isPar.or(isTresDigitos).test(11);
		
		System.out.println(validar);
	}

}
