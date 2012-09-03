/*練習問題
 *次のように画面に出力するコードを記述してください。
 *円周率の値はいくつですか？
 *3.14
 *円周率の値は3.14です。
 */
package M09D03;

import java.io.*;

import java.io.IOException;

public class M09D03_03{
	public static void main(String[] args) throws IOException{
		System.out.println("円周率の値はいくつですか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Double num = Double.parseDouble(str);
		System.out.println("円周率の値は" + num + "です。");
	}
}