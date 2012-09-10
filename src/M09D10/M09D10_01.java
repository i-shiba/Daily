/*キーボードからテストの点数を入力させ、次のように
 *各自の点数と最高点を出力するコードを配列を使って
 *記述してください。
 *
 *画面：
 *５人のテストの点数を入力してください。
 *80
 *60
 *57
 *50
 *22
 *1番目の人の点数は80点です。
 *2番目の人の点数は60点です。
 *3番目の人の点数は57点です。
 *4番目の人の点数は50点です。
 *5番目の人の点数は22点です。
 *最高数は80点です。
 */

package M09D10;

import java.io.*;

public class M09D10_01{
	public static void main(String[] args) throws IOException{
		Integer num[] = new Integer[5];
		Integer max   = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("５人のテストの点数を入力してください。");
		for(Integer i = 0; i < num.length; i++){
			String str = br.readLine();
			num[i] = Integer.parseInt(str);
		}
		for(Integer i = 0; i < num.length; i++){
			System.out.println((i + 1) + "番目の人の点数は" + num[i] + "点です。");
			if(max < num[i]){
				max = num[i];
			}
		}
		System.out.println("最高数は" + max + "点です。");
	}
}
