package kadai.kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18  {
	
	public void setGivenName() {
		givenName = "一郎";
	}
	
	public void commonIntroduce(String familyName, String ichiroGivenName, String address) {
		System.out.println("名前は" + familyName + ichiroGivenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}
	
	public void execIntroduce() {
		this.commonIntroduce("加藤", givenName, "東京都中野区〇×");
		this.eachIntroduce();
	}
}
