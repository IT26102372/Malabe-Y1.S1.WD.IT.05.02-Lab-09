public class IT261023729Q3 {
	public static double add(double a,double b){
		return a + b;
	}
	public static double multiply(double a,double b){
		return a * b;
	}
	public static double square(double a){
		return a * a;
	}
	
	public static void main(String[] args){
	
	double mult1 = multiply(3.0,4.0);
	double mult2 = multiply(5.0,7.0);
	double sum1 = add(mult1,mult2);
	double result1 = square(sum1);
	
	double sumA = add(4.0,7.0);
	double squA = square(sumA);
	double sumB = add(8.0,3.0);
	double squB = square(sumB);
	double result2 = add(squA,squB);
	
	System.out.println("Result of (3 * 4 + 5 * 7)^2   :" + result1);
	System.out.println("Result of (4 + 7)^2 + (8 + 3)^2   :" + result2);
	}
}