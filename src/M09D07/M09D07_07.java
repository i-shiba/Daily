/*キーボードから５科目のテストの点数を入力させ、
 *次のように合計点と平均点を出力するコードを
 *記述してください。
 *
 *画面：
 *科目１～５の点数を入力してください。
 *52
 *68
 *75
 *83
 *36
 *５科目の合計点は314点です。
 *５科目の平均点は62.8点です。
 */

package M09D07;

import java.io.*;

public class M09D07_07{
	public static void main(String[] args) throws IOException{
		System.out.println("科目１～５の点数を入力してください。");
		Integer num1 = 0;
		Integer num2 = 5;
		Integer sum  = 0;
		for(Integer i = 0; i < 5; i++){
			M09D07_07 cl = new M09D07_07();
			sum = cl.cluc(num1 , sum);
		}
		System.out.println("５科目の合計点は" + sum + "点です。");
		System.out.println("５科目の平均点は" + ((double)sum / num2) + "点です。");
	}
	public Integer cluc(Integer num ,Integer sum) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		sum = sum + Integer.parseInt(str);
		return sum;
	}
}