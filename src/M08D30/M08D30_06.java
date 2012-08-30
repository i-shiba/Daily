/* 練習
次のように画面に出力するコードを記述してください。８進数・１６進数を使って
２とおりのコードを記述してください。

コンソール画面に下の数値を表示させる。
6
20
13

 */

package M08D30;

public class M08D30_06 {
	public static void main(String[] args){
		//８進数で表記(頭に 0 をつける
		System.out.println("8進数で記述");
		System.out.println(006);
		System.out.println(024);
		System.out.println(015);
		//１６進数で表記(頭に 0x をつける
		System.out.println("16進数で記述");
		System.out.println(0x06);
		System.out.println(0x14);
		System.out.println(0x0d);
	}
}
