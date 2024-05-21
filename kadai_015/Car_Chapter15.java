package kadai.kadai_015;

public class Car_Chapter15 {

	public static class Car {
		//フィールド
		private int gear = 0;
		private int speed = 0;
		
		//コンストラクタ
		public Car(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		}
		
		//gearChangeメソッド
		public void gearChange(int afterGear) {
			switch(afterGear) {
				case 1 -> System.out.println("ギア" + this.gear + "からギア1に切り替えました");
				case 2 -> System.out.println("ギア" + this.gear + "からギア2に切り替えました");
				case 3 -> System.out.println("ギア" + this.gear + "からギア3に切り替えました");
				case 4 -> System.out.println("ギア" + this.gear + "からギア4に切り替えました");
				case 5 -> System.out.println("ギア" + this.gear + "からギア5に切り替えました");
				default -> System.out.println("ギア" + this.gear + "に切り替えました");				
			}
			this.gear = afterGear;
		}
		
		//runメソッド
		public void run() {
			switch(this.gear) {
				case 1 -> this.speed = 10;
				case 2 -> this.speed = 20;
				case 3 -> this.speed = 30;
				case 4 -> this.speed = 40;
				case 5 -> this.speed = 50;
				default -> this.speed = 10;
			}
			System.out.println("速度は時速" + this.speed + "kmです");
		}
	}
	
	
}
