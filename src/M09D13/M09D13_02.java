/*インスタンス変数・インスタンスメソッドを記述する。*/

package M09D13;

class Car_02{
	//これらのフィールドはインスタンス変数です。
	private Integer num;
	private Double  gas;
	
	public Car_02(){
		this.num = 0;
		this.gas = 0.0;
		System.out.println("車を作成しました。");
	}
	//インスタンスメソッドです。
	public void setCar(Integer n, Double g){
		this.num = n;
		this.gas = g;
		System.out.println("ナンバーを" + this.num + "ガソリン量を"
							+ this.gas + "にしました。");
	}
	//インスタンスメソッドです。
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリン量は" + this.gas + "です。");
	}
}

public class M09D13_02{
	public static void main(String[] args){
		Car_02 car1 = new Car_02();
		car1.setCar(1234, 20.5);
		car1.show();
		
		Car_02 car2 = new Car_02();
		car2.setCar(4567, 30.5);
		car2.show();
	}
}