/*足し算プログラム*/

package M09D04;

import java.io.*;

public class M09D04_03{
	public static void main(String[] args) throws IOException{
		System.out.println("２つの整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		Integer num1 = Integer.parseInt(str1);
		Integer num2 = Integer.parseInt(str2);
		
		System.out.println("足し算の結果は" + (num1 + num2) + "です。");
	}
}