/*引数を持つメソッドを呼び出す*/

package M09D10;

class Car_05{
	public Integer num;
	public Double  gas;
	
	public void setNum(Integer n){
		this.num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	public void setGas(Double g){
		this.gas = g;
		System.out.println("ガソリンの量を" + gas + "にしました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリンの量は" + this.gas + "です。");
	}
}

public class M09D10_05{
	public static void main(String[] args){
		Car_05 car1 = new Car_05();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}