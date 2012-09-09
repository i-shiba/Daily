/*次のように画面に出力するコードを記述してください
 *
 *画面：
 *1～10までの偶数を出力します。
 *2
 *4
 *6
 *8
 *10
 */

package M09D09;

public class M09D09_01{
	public static void main(String[] args){
		System.out.println("1～10までの偶数を出力します。");
		for(Integer i = 1;i <= 10;i++){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}
}