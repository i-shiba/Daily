/*キーボードから整数を入力させ、その数が素数（１または
 *その数以外で割り切れない数）であるかどうかを判断する
 *コードを記述してください。
 *
 *画面１：
 *２以上の整数を入力してください。
 *7
 *7は素数です。
 *画面２：
 *２以上の整数を入力してください。
 *10
 *10は素数ではありません。
 */

package M09D09;

import java.io.*;

public class M09D09_05{
	public static void main(String[] args) throws IOException{
		Boolean boo = true;
		System.out.println("２以上の整数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str = br.readLine();
		Integer num = Integer.parseInt(str);
		for(Integer i = 2; i < num; i++){
			if(num % i == 0){
				boo = false;
				break;
			}
		}
		if(boo == true){
			System.out.println(num + "は素数です。");
		}else{
			System.out.println(num + "は素数ではありません。");
		}
	}
}
