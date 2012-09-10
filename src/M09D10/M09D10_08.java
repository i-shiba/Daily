/*次のように、整数値の座標をあらわすMyPointクラスを
 *作成してください。
 *フィールド：
 *Integer x :(X座標)
 *Integer y :(Y座標)
 *メソッド：
 *void setX :(X座標を設定する)
 *void setY :(Y座標を設定する)
 *Integer getX():(X座標を得る)
 *Integer getY():(Y座標を得る)
 */

package M09D10;

class MyPoint_08{
	public Integer x;
	public Integer y;
	
	public void setX(Integer x){
		this.x = x;
	}
	public void setY(Integer y){
		this.y = y;
	}
	public Integer getX(){
		return this.x;
	}
	public Integer getY(){
		return this.y;
	}
}

public class M09D10_08{
	public static void main(String[] args){
		MyPoint_08 mp = new MyPoint_08();
		mp.setX(5);
		mp.setY(10);
		Integer x = mp.getX();
		Integer y = mp.getY();
		
		System.out.println("X座標は" + x + "  Y座標は" + y + "です。");
	}
}
