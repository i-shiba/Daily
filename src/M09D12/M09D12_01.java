/*コンストラクタが呼び出される*/

package M09D12;

class Car_01{
	private Integer num;
	private Double  gas;
	
	public Car_01(){
		this.num = 0;
		this.gas = 0.0;
		System.out.println("車を作成しました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class M09D12_01{
	public static void main(String[] args){
		Car_01 car1 = new Car_01();
		
		car1.show();
	}
}