/*次の計算結果を出力するコードを記述してください。
 *0-4
 *3.14×2
 *5÷3
 *30÷7のあまりの数
 *(7+32)÷5
 */

package M09D07;

import java.io.*;

public class M09D07_04{
	public static void main(String[] args) throws IOException{
		Integer ans1 = 0 - 4;
		Double  ans2 = 3.14 * 2;
		Double  ans3 = Double.valueOf(5) / 3;
		Integer ans4 = 30 % 7;
		Double  ans5 = Double.valueOf(7 + 32) / 5;
		
		System.out.println("0-4の計算結果は" + ans1 + "です。");
		System.out.println("3.14×2の計算結果は" + ans2 + "です。");
		System.out.println("5÷3の計算結果は" + ans3 + "です。");
		System.out.println("30÷7のあまりの数の計算結果は" + ans4 + "です。");
		System.out.println("(7+32)÷5の計算結果は" + ans5 + "です。");
	}
	
}