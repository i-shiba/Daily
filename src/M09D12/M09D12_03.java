/*別のコンストラクタを呼び出す*/

package M09D12;

class Car_03{
	private Integer num;
	private Double  gas;
	
	public Car_03(){
		this.num = 0;
		this.gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public Car_03(Integer n, Double g){
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

public class M09D12_03{
	public static void main(String[] args){
		Car_03 car1 = new Car_03();
		car1.show();
		
		Car_03 car2 = new Car_03(1234, 20.5);
		car2.show();
	}
}