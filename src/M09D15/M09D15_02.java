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
 *
 *これをif文を使用しないで作成する。
 *入力整数の値を代入したローカル変数の値を組み込みたいので
 *mainメソッド内に作成してみた。
 */

package M09D15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class M09D15_02{
	
	
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str = br.readLine();
		Integer num = Integer.parseInt(str);
		
		Map<Boolean, String> ansMap;
		ansMap = new HashMap<Boolean, String>();
		ansMap.put(true , num + "は偶数です。");
		ansMap.put(false, num + "は奇数です。");
		
		String str1 = ansMap.get(num % 2 == 0);
		System.out.println(str1);
		
	}
}