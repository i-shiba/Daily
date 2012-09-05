/*複合的な代入演算子を行う*/

package M09D05;

import java.io.*;

public class M09D05_03{
	public static void main(String[] args) throws IOException{
		System.out.println("整数を３つ入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		
		Integer sum = 0;
		sum += Integer.parseInt(str1);
		sum += Integer.parseInt(str2);
		sum += Integer.parseInt(str3);
		
		System.out.println("３つの数の合計は" + sum + "です。");
	}
}