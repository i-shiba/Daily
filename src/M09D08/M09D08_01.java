/*キーボードから整数値を入力させ、場合に応じて次のようなメッセージを
 *出力するコードを記述してください。
 *値が偶数だった場合……「○は偶数です。」
 *値が奇数だった場合……「○は奇数です。」
 *ただし○は入力した整数
 *
 *画面：
 *整数を入力してください。
 *1
 *1は奇数です。
 */

package M09D08;

import java.io.*;

public class M09D08_01{
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str = br.readLine();
		Integer num = Integer.parseInt(str);
		if(num % 2 == 0){
			System.out.println(num + "は偶数です。");
		}else{
			System.out.println(num + "は奇数です。");
		}
	}
}