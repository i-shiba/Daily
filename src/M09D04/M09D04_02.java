/*変数の値を使う*/

package M09D04;

public class M09D04_02{
	public static void main(String[] args){
		Integer num1 = 2;
		Integer num2 = 3;
		Integer sum  = num1 + num2;
		
		System.out.println("変数num1の値は" + num1 + "です。");
		System.out.println("変数num2の値は" + num2 + "です。");
		System.out.println("num1+num2の値は" + sum + "です。");
		
		num1 = num1 + 1;
		
		System.out.println("変数num1の値に1をたすと" + num1 + "です。");
	}
	
}