/*キーボードから三角形の高さと底辺を整数で入力させ、
 *次のようの面積を出力するコードを記述してください。
 *
 *画面：
 *三角形の高さと底辺を入力してください。
 *3
 *5
 *三角形の面積は7.5です。
 */

package M09D07;

import java.io.*;

public class M09D07_06{
	public static void main(String[] args) throws IOException{
		System.out.println("三角形の高さと底辺を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		System.out.println("三角形の面積は" + (Double.valueOf(Double.parseDouble(str1) * Double.parseDouble(str2)) / 2) + "です。");
		
	}
}
