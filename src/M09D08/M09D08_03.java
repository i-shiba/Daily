/*キーボードから整数値を入力させ、場合に応じて次のような
 *メッセージを出力するコードを記述してください。
 *値が０～１０の場合…「正解です。」
 *それ以外の場合………「間違いです。」
 *
 *画面：
 *０から１０までの整数を入力してください。
 *1
 *正解です。
 */

package M09D08;

import java.io.*;

public class M09D08_03{
	public static void main(String[] args) throws IOException{
		System.out.println("０から１０までの整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str = br.readLine();
		Integer num = Integer.parseInt(str);
		if(num <= 10){
			System.out.println("正解です。");
		}else{
			System.out.println("間違いです。");
		}
	}
}