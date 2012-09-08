/*キーボードから２つの整数値を入力させ、場合に応じて次のような
 *メッセージを出力するコードを記述してください。
 *
 *値が同じ場合………「２つの数は同じ値です。」
 *それ以外の場合……「○より×のほうが大きい値です。」
 *ただし○、×は入力した整数。○＜×
 *
 *画面：
 *２つの整数を入力してください。
 *1
 *3
 *1より3のほうが大きい値です。
 */

package M09D08;

import java.io.*;

public class M09D08_02{
	public static void main(String[] args) throws IOException{
		System.out.println("２つの整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str  = br.readLine();
		Integer num1 = Integer.parseInt(str);
		str  = br.readLine();
		Integer num2 = Integer.parseInt(str);
		while(num1 > num2){
			System.out.println("２つ目の入力は１つ目と同じか大きい整数にしてください。");
			str  = br.readLine();
			num1 = Integer.parseInt(str);
			str  = br.readLine();
			num2 = Integer.parseInt(str);
		}
		if(num1 == num2){
			System.out.println("2つの整数は同じ値です。");
		}else{
			System.out.println(num1 + "より" + num2 + "のほうが大きい値です。");
		}
	}
}