/*クラス内でメソッドを呼び出す*/

package M09D10;

class Car_04{
	public Integer num;
	public Double  gas;
	
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリンの量は" + this.gas + "です。");
	}
	public void showCar(){
		System.out.println("これから車の情報を表示します。");
		this.show();
	}
}

public class M09D10_04{
	public static void main(String[] args){
		Car_04 car1;
		car1 = new Car_04();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
	}
}