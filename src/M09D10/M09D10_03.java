/*メソッドを呼び出す*/

package M09D10;

class Car_03{
	public Integer num;
	public Double  gas;
	
	void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリンの量は" + this.gas + "です。");
	}
}

public class M09D10_03{
	public static void main(String[] args){
		Car_03 car1;
		car1 = new Car_03();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
	}
}
