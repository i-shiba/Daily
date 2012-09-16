/*文字列を検索する*/

package M09D16;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class M09D16_03{
	
	private static Map<Boolean, String> ansMap;
	private static String ansMt(String str1, Integer num, Character ch){
		M09D16_03.ansMap = new HashMap<Boolean, String>();
		M09D16_03.ansMap.put(true, str1 + "の" + (num + 1) + "番目に「"
							+ ch + "」が見つかりました。");
		M09D16_03.ansMap.put(false, str1 + "に「" + ch + "」はありません。");
		String str = M09D16_03.ansMap.get(num != -1);
		return str;
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("検索文字を入力してください。");
		
		String str2 = br.readLine();
		Character ch = str2.charAt(0);
		
		Integer num = str1.indexOf(ch);
		
		System.out.println(str1 + num + ch);
		
		
		String str = M09D16_03.ansMt(str1, num, ch);
		
		System.out.println(str);
	}
}