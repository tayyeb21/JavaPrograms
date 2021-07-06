package javaLiteralsDataTypes;

public class LiteralsTuts {
	public static void main(String[] args) {
		char c = 0xA8E0; // character from unicode chart
		System.out.println(c);
		byte hex = 0xA; // Hexadecimal representation 10
		System.out.println(hex);
		byte oct = 012; // octal representation 10
		System.out.println(oct);
		byte bin = 0b1010; // binary representation 10
		System.out.println(bin);
		/* By default decimal point number is declared as double in java */
		float f = 135.12f; // float representation 
		System.out.println(f);
		System.out.println("Memory Represenation of " + f); // 13512E^-2
		System.out.println(Float.floatToIntBits(f));
	}
}
