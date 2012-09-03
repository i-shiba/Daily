/*二つ以上の数値を続けて入力する。*/

package M09D03;

import java.io.*;

public class M09D03_01{
	public static void main(String[] args) throws IOException{
		System.out.println("整数を２つ入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		Integer num1 = Integer.parseInt(str1);
		Integer num2 = Integer.parseInt(str2);
		System.out.println("最初に" + num1 + "が入力されました。");
		System.out.println("次に" + num2 + "が入力されました。");
	}
}