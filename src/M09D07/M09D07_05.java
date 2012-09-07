/*キーボードから正方形の一辺の長さを整数で入力させ、
 *次のように面積を出力するコードを記述してください。
 *
 *画面：
 *正方形の辺の長さを入力してください。
 *3
 *正方形の面積は9です。
 */

package M09D07;

import java.io.*;

public class M09D07_05{
	public static void main(String[] args) throws IOException{
		System.out.println("正方形の辺の長さを入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer num = Integer.parseInt(str);
		System.out.println("正方形の面積は" + num * num + "です。");
	}
}