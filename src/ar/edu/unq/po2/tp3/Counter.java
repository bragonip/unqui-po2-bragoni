package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

//ejercicio 1
public class Counter {

	private ArrayList<Integer> counter;

	public Counter() {
		counter = new ArrayList<Integer>();
	}

	private ArrayList<Integer> getCounter() {
		return counter;
	}

	public void addNumber(Integer number) {
		this.getCounter().add(number);
	}

	public Integer getEvenOcurrences() {
		Integer c = 0;
		for (Integer number : this.getCounter()) {
			if (isEven(number)) {
				c++;
			}
		}
		return c;
	}

	public Integer getOddOcurrences() {
		return this.getCounter().size() - this.getEvenOcurrences();
	}

	private boolean isEven(Integer number) {
		return (number % 2 == 0);
	}

	public Integer getMultiplosDe(Integer number) {
		Integer c = 0;
		for (Integer number1 : this.getCounter()) {
			if (esMultiploDe(number1, number)) {
				c++;
			}
		}
		return c;
	}

	private boolean esMultiploDe(Integer number1, Integer number2) {
		return (number1 % number2 == 0);
	}

//ejercicio 2
	public Integer elQueMasParesTiene(ArrayList<Integer> numbers) {
		Integer max = 0;

		for (Integer number : numbers) {
			if (paresDe(max) < paresDe(number)) {
				max = number;
			}
		}
		return max;
	}

	private Integer paresDe(Integer number) {
		Integer a = 0;
		Integer b = number;

		while (b != 0) {
			if (this.isEven(b % 10)) {
				a++;
			}
			b = b / 10;
		}
		return a;
	}

//ejercicio 3
	public int maxMultiploMenorA1000(int a, int b) {
		int x;
		for (x = 1000; (!(this.esMultiploDe(x, a) && this.esMultiploDe(x, b)) && x != 0); x--) {
		}
		if (x == 0) {
			x--;
		}
		;
		return x;
	}

//ejercicio 4
//	public static void main(String[] args) {
//		String a = "abc";
//		String s = a;
//		String t;
//		
//		System.out.println(a.substring(1,3).equals("bc"));
//		
//	}


//	s.length(); 3

//	t.length(); no fue inicializada

//	1 + a; 1abc

//	a.toUpperCase(); ABC

//	"Libertad".indexOf("r"); 4

//	"Universidad".lastIndexOf('i'); 7

//	"Quilmes".substring(2,4); il

//	(a.length() + a).startsWith("a"); false

//	s == a; true

//	a.substring(1,3).equals("bc") true
	
//ejercicio 5
	static int a;
	static Integer b;
	
	public static void main(String[] args) {
		int c = 0;
		Integer d = null;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	
//	1.¿Qué son los tipos de datos primitivos?
//	tipos que viene predefinididos en el lenguaje
//	2.¿Cuál es la diferencia entre un int y un Integer?
//	int es primitivo, integer es una clase
//	3.¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se define una de tipo Integer? Haga la prueba en Eclipse.
//	int es 0, Integer es null, pero me hizo ponerlos como static
//	4.Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de instancia se define una variable de método.
//	int es 0, Integer es null, pero me obliga a declararlos
}
