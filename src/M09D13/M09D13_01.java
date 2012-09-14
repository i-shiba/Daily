/*コンストラクタに修飾子を付ける*/

package M09D13;

class Car_01{
	private Integer num;
	private Double  gas;
	
	private Car_01(){
		this.num = 0;
		this.gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public Car_01(Integer n, Double g){
		this();
		this.num = n;
		this.gas = g;
		System.out.println("ナンバーを" + this.num + "ガソリン量を"
							+ this.gas + "にしました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリン量は" + this.gas + "です。");
	}
}

public class M09D13_01{
	public static void main(String[] args){
//		引き数なしのコンストラクタをprivateにしたため外部から
//		アクセスできません。
//		Car_01 car1 = new Car_01();
//		car1.show();
		
		Car_01 car2 = new Car_01(1234, 20.5);
		car2.show();
	}
}