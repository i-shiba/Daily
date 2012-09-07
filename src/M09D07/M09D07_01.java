/*大きなサイズの型に代入する*/

package M09D07;

public class M09D07_01{
	public static void main(String[] args){
		int inum = 160;
		
		System.out.println("身長は" + inum + "センチです。");
		
		System.out.println("double型の変数に代入します。");
//		double dnum = (double)inum;
		double dnum = inum;
		System.out.println("身長は" + dnum + "センチです。");
		
		System.out.println("Integer型の変数に代入します。");
		Integer intNum = inum;
		System.out.println("身長は" + intNum + "センチです。");
		
		System.out.println("Double型の変数に代入します。");
//		Double dblNum = (double)intNum;
//		Double dblNum = intNum.doubleValue();
		Double dblNum = Double.valueOf(intNum);
		System.out.println("身長は" + dblNum + "センチです。");
		
	}	
}
