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
 */

package M09D15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class M09D15_01{
	
	private static Map<Boolean, String> ansMap;
	static{
		M09D15_01.ansMap = new HashMap<Boolean, String>();
		M09D15_01.ansMap.put(true , "は偶数です。");
		M09D15_01.ansMap.put(false, "は奇数です。");
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str = br.readLine();
		Integer num = Integer.parseInt(str);
		
		String str1 = ansMap.get(num % 2 == 0);
		System.out.println(num + str1);
	}
}