/*練習問題
 *次のようの画面に出力するコードを記述してください。
 *あなたは何歳ですか？
 *35
 *あたなは35歳です。
 */

package M09D03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M09D03_02{
	public static void main(String[] args) throws IOException{
		System.out.println("あなたは何歳ですか？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer num = Integer.parseInt(str);
		System.out.println("あなたは" + num + "歳です。");
	}
}