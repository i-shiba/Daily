/*メンバへのアクセスを制限する。*/

package M09D11;
//車クラス
class Car_02{
	private Integer num;
	private Double  gas;
	
	public void setNumGas(Integer n, Double g){
		if(g > 0 && g < 1000){
			this.num = n;
			this.gas = g;
			System.out.println("ナンバーを" +  this.num + "ガソリン量を"
								+  this.gas + "にしました。");
		}else{
			System.out.println(g + "は正しいガソリン量ではありません。");
			System.out.println("ガソリン量を変更できませんでした。");
		}
	}
	
	public void show(){
		System.out.println("車のナンバーは" + this.num + "です。");
		System.out.println("ガソリン量は" +	 this.gas + "です。");
	}
}

public class M09D11_02{
	public static void main(String[] args){
		Car_02 car1 = new Car_02();
//		このようなアクセスはできなくなります。		
//		car1.num = 1234;
//		car1.gas = 20.5;
		
		car1.setNumGas(1234,20.5);
		car1.show();
		
		System.out.println("正しくないガソリン量（-10.0）を指定してみます・・・。");
		
		car1.setNumGas(1234,-10.0);
		car1.show();
	}
}