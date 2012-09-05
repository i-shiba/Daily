/*前置・後置インクリメント演算子を使う*/

package M09D05;

public class M09D05_01{
	public static void main(String[] args){
		Integer a = 0;
		Integer b = 0;
		
		b = a++;
		
		System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
		System.out.println("代入後にインクリメントしたのでaの値は" + a + "です。");
		
		a = 0;
		
		System.out.println("aに0を代入したのでaの値は" + a + "です。");
		
		b = ++a;
		System.out.println("代入前にインクリメントしたのでbの値は" + b + "です。");
		System.out.println("代入前にインクリメントしたのでaの値は" + a + "です。");
	}
}