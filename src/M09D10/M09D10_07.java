/*戻り値をもつメソッド*/

package M09D10;

class Car_07{
	public Integer num;
	public Double  gas;
	
	public Integer getNum(){
		System.out.println("ナンバーを調べました。");
		return this.num;
	}
	public Double getGas(){
		System.out.println("ガソリン量を調べました。");
		return this.gas;
	}
	public void setNumGas(Integer num, Double gas){
		this.num = num;
		this.gas = gas;
		System.out.println("車のナンバーを" + this.num + "にガソリン量を"
				+ this.gas + "にしました。");
	}
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリンの量は" + this.gas + "です。");
	}
}

public class M09D10_07{
	public static void main(String[] args){
		Car_07 car1 = new Car_07();
		
		car1.setNumGas(1234, 20.5);
		
		Integer number   = car1.getNum();
		Double  gasoline = car1.getGas();
		
		System.out.println("サンプルから車を調べたところ");
		System.out.println("ナンバーは" + number + "ガソリン量は"
							+ gasoline + "でした。");
	}
}
