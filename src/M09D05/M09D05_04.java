/*シフト演算子を使う*/

package M09D05;

public class M09D05_04{
	public static void main(String[] args){
		Integer a = 1;
		Integer b = -1;
		
		a <<= 5;
		System.out.println("aの値は1でした。a <<= 5 を行うとaの値は" + a + "になります。");
		a >>= 3;
		System.out.println("aの値は32でした。a >>= 3 を行うとaの値は" + a + "になります。");
		a >>= 10;
		System.out.println("aの値は4でした。a >>= 10 を行うとaの値は" + a + "になります。");
		b <<= 5;
		System.out.println("bの値は-1でした。b <<= 5 を行うとbの値は" + b + "になります。");
		b >>= 3;
		System.out.println("bの値は-32でした。b >>= 3 を行うとbの値は" + b + "になります。");
		b >>= 10;
		System.out.println("bの値は-4でした。b >>= 10 を行うとbの値は" + b + "になります。");
		
		a = 100;
		b = -100;
		System.out.println("aに100を代入したので、aの値は" + a + "です。");
		System.out.println("bに-100を代入したので、bの値は" + b + "です。");
		a >>>= 3;
		System.out.println("aの値は100でした。a >>>= 3 を行うとaの値は" + a + "になります。");
		b >>>= 3;
		System.out.println("bの値は-100でした。b >>>= 3 を行うとbの値は" + b + "になります。");
	}
}