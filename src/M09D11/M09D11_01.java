/*クラスの外からメンバにアクセスする。*/

package M09D11;
//車クラス
class Car_01{
	public Integer num;
	public Double  gas;
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" +	gas + "です。");
	}
}

public class M09D11_01{
	public static void main(String[] args){
		Car_01 car1 = new Car_01();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.show();
	}
}