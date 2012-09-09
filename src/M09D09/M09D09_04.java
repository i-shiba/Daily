/*次のように画面に出力するコードを記述してください。
 *
 *画面：
 **
 ***
 ****
 *****
 ******
 */

package M09D09;

public class M09D09_04{
	public static void main(String[] args){
		String str = "*";
		while(!"******".equals(str)){
			System.out.println(str);
			str = str + "*";
		}
	}
}