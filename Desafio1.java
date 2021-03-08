package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;


import java.text.DecimalFormat; 

public class Desafio1 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
 		
		BinaryOperator<Double> precoFinal = (n1, n2) -> (n1 * (1 - n2));
		
		Double total = precoFinal.apply(p.preco, p.desconto);
		
		Function<Double, Double> imposto = i -> i >= 2500 ?  total - (total * (1 - 0.085)):0.00;
		
		Function<Double, Double> frete = f -> total >= 3000.0 ? 100.0 : 50.0;
		
		System.out.println("O preço total com desconto é R$" + df.format(total));
		System.out.println("O imposto é de R$" + df.format(imposto.apply(total)));
		System.out.println("O valor do frete é de R$" + df.format(frete.apply(total)));
		System.out.println("Total geral R$" + df.format(total + imposto.apply(total) + frete.apply(total)));
		
	}

}
