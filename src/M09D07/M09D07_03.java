/*同じ型の演算を異なる型に代入する
 *キャストして演算を行い異なる型に代入する。
 */

package M09D07;

public class M09D07_03{
	public static void main(String[] args){
		int pnum1 = 5;
		int pnum2 = 4;
		
		double pdiv = pnum1 / pnum2;
		
		System.out.println("5/4は" + pdiv + "です。");
		
		pdiv = (double)pnum1 / (double)pnum2;
		
		System.out.println("5/4は" + pdiv + "です。");
		
		Integer num1 = 5;
		Integer num2 = 4;
		
		Double div = Double.valueOf(num1) / Double.valueOf(num2);
		
		System.out.println("5/4は" + div + "です。");
	}
}