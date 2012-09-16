/*文字列の長さと文字を取り出す*/

package M09D16;

public class M09D16_01{
	public static void main(String[] args){
		String str = "Hello";
		
		Character ch1 = str.charAt(0);
		Character ch2 = str.charAt(1);
		
		Integer len = str.length();
		
		System.out.println(str + "の１番目の文字は" + ch1 + "です。");
		System.out.println(str + "の２番目の文字は" + ch2 + "です。");
		System.out.println(str + "の長さは" + len + "です。");
		
		
	}
}