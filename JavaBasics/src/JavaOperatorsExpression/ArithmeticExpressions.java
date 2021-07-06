package JavaOperatorsExpression;

import java.util.Scanner;

public class ArithmeticExpressions {
	
	public static double areaTriangle(int a, int b, int c) {
		double area, s;
		s = (a+b+c)/2d;
		area = Math.sqrt( s * (s - a) * (s - b) * (s - c) );
//		System.out.println(s);
//		System.out.println( Math.sqrt( s * (s - a) * (s - b) * (s - c) ));
		
		return area;
	}
	
	public static void qudraticEquation(int c1, int c2, int c3) {
		double r1, r2;
		
		r1 = ( (-c2) + Math.sqrt( (c2*c2) - (4*c1*c3) ) ) / (2 * c1);
		r2 = ( (-c2) - Math.sqrt( (c2*c2) - (4*c1*c3) ) ) / (2 * c1);
		
		System.out.printf("Root 1: %.2f %nRoot 2: %.2f %n", r1, r2);
		
	}
	
	public static void cuboid(float length, float breadth, float height) {
		double area, volume;
		area = 2 * (length * breadth + length * height + breadth * height);
		volume = length * breadth * height;
		System.out.printf("Area of Cuboid %.2f %nVolume of Cuboid %.2f %n", area, volume);
	}
	
	public static void main(String[] args) {
		/* Arithmetic Operator 
		 * () having highest precedence among below operator
		 *  [ * / % ] having higher precedence with left to right associativity 
		 *  [ + - ] having lower precedence with left to right associativity
	     */
		/* Mod operation */
		float quotient1 = 12.7f / 3.1f;
		float remainder1 = 12.7f % 3.1f; 
		// will give result as 0.3 in java because in mod operation on decimal point number java take only integer quotient and ignores decimal point quotient calculation
		
		System.out.printf("Qutioent %f %nRemainder %f %n", quotient1, remainder1);
		
		/* Operator Precedence */
		/* a+b
		 * ---		a + b / 2 will give result as 11 because divide has higher precedence 
		 * 2
		 * */
		int precedence1 = 	6 + 10 / 2;
		int precedence2 = 	(6 + 10) / 2;
		System.out.printf("Expression Without Paranthesis %d %nExpression with Paranthesis %d %n", precedence1, precedence2);
		
		/* Arithmetic Operations on diffrent datatypes and their results
		 * 
		 * byte + byte = integer
		 * short + byte = integer
		 * int + byte/short = integer
		 * int + long = long (higher level data type)
		 * char + byte = integer (char is also treated as integer internally)
		 * because every non decimal point number in java in integer so compiler does coercion (internal type change)
		 *   
		 *  float + int = float 
		 *  float + long = float
		 *  double + float = double (higher level data type)
		 *  double + long = double (coercion)
		 *  because float/double is having decimal point so compiler will change integer in float (coercion)
		 *   
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides of triangle: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Area of Triangle: " + ArithmeticExpressions.areaTriangle(a, b, c));
		
		
		System.out.println("Enter the coefficient of quadratic equation: ");
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();
		ArithmeticExpressions.qudraticEquation(c1, c2, c3);
		
		System.out.println("Enter the length breadth and height of cuboid: ");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int height = sc.nextInt();
		ArithmeticExpressions.cuboid(length, breadth, height);
		
		
		sc.close();
	}
}