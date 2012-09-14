/*クラス変数・クラスメソッドを記述する。*/

package M09D13;

class Car_03{
	public static Integer sum = 0;
	
	private Integer num;
	private Double  gas;
	
	public Car_03(){
		this.num = 0;
		this.gas = 0.0;
		sum++;
		System.out.println("車を作成しました。");
	}
	public void setCar(Integer n, Double g){
		this.num = n;
		this.gas = g;
		System.out.println("ナンバーを" + this.num + "ガソリン量を"
				+ this.gas + "にしました。");
	}
	public static void showSum(){
		System.out.println("車は全部で" + sum + "台あります。");
	}
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリン量は" + this.gas + "です。");
	}
}

public class M09D13_03{
	public static void main(String[] args){
		Car_03.showSum();
		
		Car_03 car1 = new Car_03();
		car1.setCar(1234, 20.5);
		
		Car_03.showSum();
		
		Car_03 car2 = new Car_03();
		car2.setCar(4567, 30.5);
		
		Car_03.showSum();
	}
}

	