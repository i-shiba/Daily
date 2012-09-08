/*キーボードから１から５までの５段階の成績を入力させ、
 *場合に応じて次のようなメッセージを出力するコードを
 *記述してください。
 *
 *成績			メッセージ
 *1				もっとがんばりましょう。
 *2				もう少しがんばりましょう。
 *3				さらに上をめざしましょう。
 *4				たいへんよくできました。
 *5				たいへん優秀です。
 *
 *画面：
 *成績を入力してください。
 *3
 *さらに上をめざしましょう。
 */

package M09D08;

import java.io.*;

public class M09D08_04{
	public static void main(String[] args) throws IOException{
		System.out.println("成績を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str = br.readLine();
		Integer num = Integer.parseInt(str);
		switch (num) {
		case 1:
			System.out.println("もっとがんばりましょう。");
			break;
		case 2:
			System.out.println("もう少しがんばりましょう。");
			break;
		case 3:
			System.out.println("さらに上をめざしましょう。");
			break;
		case 4:
			System.out.println("たいへんよくできました。");
			break;
		case 5:
			System.out.println("たいへん優秀です。");
			break;
		default:
			System.out.println("整数1から5で入力してください。");
			break;
		}
	}
}
