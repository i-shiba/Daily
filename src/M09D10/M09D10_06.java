/*複数の引数をもつメソッドを呼び出す*/

package M09D10;

class Car_06{
	public Integer num;
	public Double  gas;
	
	public void setNumGas(Integer n, Double g){
		this.num = n;
		this.gas = g;
		System.out.println("車のナンバーを" + this.num + "にガソリン量を"
							+ this.gas + "にしました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリンの量は" + this.gas + "です。");
	}
}

public class M09D10_06{
	public static void main(String[] args){
		Car_06 car1 = new Car_06();
		
		Integer number   = 1234;
		Double  gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
	}
}