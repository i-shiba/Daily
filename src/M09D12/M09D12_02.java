/*コンストラクタをオーバーロードする。*/

package M09D12;

class Car_02{
	private Integer num;
	private Double  gas;
	
	public Car_02(){
		this.num = 0;
		this.gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public Car_02(Integer n, Double g){
		this.num = n;
		this.gas = g;
		System.out.println("ナンバー" + this.num + "ガソリン量" + 
							this.gas + "の車を作成しました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリン量は" + this.gas + "です。");
	}
	
}

public class M09D12_02{
	public static void main(String[] args){
		Car_02 car1 = new Car_02();
		car1.show();
		
		Car_02 car2 = new Car_02(1234, 20.5);
		car2.show();
	}
}