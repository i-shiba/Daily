/*キーボードからテストの点数を入力させ、その合計点を
 *出力するコードを記述してください。最後に答えを出力
 *させる場合には、０を入力するものとします。
 *
 *画面：
 *テストの点数を入力してください。（０で終了）
 *52
 *68
 *75
 *83
 *36
 *0
 *テストの合計点は314点です。
 */

package M09D09;

import java.io.*;

public class M09D09_02{
	public static void main(String[] args) throws IOException{
		Integer num = 0;
		Integer sum = 0;
		System.out.println("テストの点数を入力してください。（０で終了）");
		do{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
		}while(num != 0);
		System.out.println("テストの合計点は" + sum + "点です。");
	}
}