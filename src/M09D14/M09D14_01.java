/*次のように、整数値の座標をあらわすMyPointクラスを作成してください。
 *ただし、座標軸の範囲は０～１００となるようにしてください。
 *
 *フィールド：
 *private int x:(x座標)
 *private int y:(y座標)
 *
 *メソッド：
 *public void setX(int px):(X座標を設定する)
 *public void setY(int py):(Y座標を設定する)
 *public int getX():(X座標を得る)
 *public int getY():(Y座標を得る)
 *
 *コンストラクタ：
 *public MyPoint():(初期座標を（０，０）とする)
 *public MyPoint(int x, int py):(初期座標を指定する)
 *
 */

package M09D14;

class MyPoint{
	private Integer x;
	private Integer y;
	
	public MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	public MyPoint(Integer x, Integer y){
		if(0 <= x && x <= 100){
			this.x = x;
		}else{
			this.x = 0;
		}
		if(0 <= y && y <= 100){
			this.y = y;
		}else{
			this.y = 0;
		}
	}
	public void setX(Integer x){
		if(0 <= x && x <= 100){
			this.x = x;
		}else{
			this.x = 0;
		}
	}
	public void setY(Integer y){
		if(0 <= y && y <= 100){
			this.y = y;
		}else{
			this.y = 0;
		}
	}
	
	public Integer getX(){
		return x;
	}
	public Integer getY(){
		return y;
	}
}

public class M09D14_01{
	public static void main(String[] args){
		MyPoint mp1 = new MyPoint();
		mp1.setX(30);
		mp1.setY(20);
		Integer x = mp1.getX();
		Integer y = mp1.getY();
		System.out.println("X座標は" + x + "、Y座標は" + y + "です。");

		MyPoint mp2 = new MyPoint(50, 80);
		x = mp2.getX();
		y = mp2.getY();
		System.out.println("X座標は" + x + "、Y座標は" + y + "です。");
	}
}