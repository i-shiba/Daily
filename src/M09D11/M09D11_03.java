/*メソッドをオーバーロードする*/

package M09D11;

class Car_03{
	private Integer num;
	private Double  gas;
	
	public void setCar(Integer n){
		this.num = n;
		System.out.println("ナンバーを" + this.num + "にしました。");
	}
	public void setCar(Double g){
		this.gas = g;
		System.out.println("ガソリン量を" + this.gas + "にしました。");
	}
	public void setCar(Integer n, Double g){
		this.num = n;
		this.gas = g;
		System.out.println("ナンバーを" + this.num +"ガソリン量を" 
							+ this.gas + "にしました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリン量は" + this.gas + "です。");
	}
}

public class M09D11_03{
	public static void main(String[] args){
		Car_03 car1 = new Car_03();
		car1.setCar(1234, 20.5);
		car1.show();
		
		System.out.println("車のナンバーだけ変更します。");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("ガソリン量だけ変更します。");
		car1.setCar(30.5);
		car1.show();
	}
}