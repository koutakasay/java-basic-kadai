package kadai.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName() {
		givenName = "太郎";
	}
	
	public void commonIntroduce(String familyName, String taroGivenName, String address) {
		System.out.println("名前は" + familyName + taroGivenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
	
	public void execIntroduce() {
		this.commonIntroduce("加藤", givenName, "東京都中野区〇×");
		this.eachIntroduce();
	}
}
