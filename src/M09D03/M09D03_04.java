/*練習問題
 *次のように画面に出力するコードを記述してください。
 *
 *身長と体重を入力してください。
 *163.5
 *57.5
 *身長は163.5センチです。
 *体重は57.5キロです。
 */
package M09D03;

import java.io.*;

public class M09D03_04{
	public static void main(String[] args) throws IOException{
		System.out.println("身長と体重を入力してください。");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		String str2 = br2.readLine();
		Double num1 = Double.parseDouble(str1);
		Double num2 = Double.parseDouble(str2);
		System.out.println("身長は" + num1 + "センチです。");
		System.out.println("体重は" + num2 + "キロです。");
	}
}