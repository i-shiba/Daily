/*代入演算子を使う*/

package M09D05;

public class M09D05_02{
	public static void main(String[] args){
		Integer a = 1;
		Integer b = 1;
		
		System.out.println("aの値は" + a + "です。");
		System.out.println("bの値は" + b + "です。");
		
		a = a + b;
		System.out.println("a = a + b を行うとaの値は" + a + "です。" );
		System.out.println("a = a + b を行うとbの値は" + b + "です。" );
		
		a = 1;
		b = 1;
		System.out.println("aの値を" + a + "に戻します。");
		System.out.println("bの値を" + b + "に戻します。");
		
		a += b;
		System.out.println("a += b を行うとaの値は" + a + "です。" );
		System.out.println("a += b を行うとbの値は" + b + "です。" );
		
	}
}