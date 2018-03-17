
public class Calculator {

	public double sum(double i, double j) {
		return i + j;
	}

	public double substract(double i, double j) {
		return i - j;
	}

	public double multiply(double i, double j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	public double divide(double i, double j) {
		// TODO Auto-generated method stub
		return i/j;
	}
	
	
	// dla double dzielenie przez 0 daje Infinity
	public static void main(String [ ] args)
	{
		Calculator wynik = new Calculator();
		double wyn = wynik.divide(4.0, 0);
	    System.out.println(wyn);
	}
}
