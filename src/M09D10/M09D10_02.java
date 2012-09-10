/*クラスを利用する*/

package M09D10;

class Car_02{
	public Integer num;
	public Double  gas;
}

public class M09D10_02{
	public static void main(String[] args){
		Car_02 car1;
		car1 = new Car_02();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("車のナンバーは" + car1.num + "です。");
		System.out.println("ガソリンの量は" + car1.gas + "です。");
	}
}

