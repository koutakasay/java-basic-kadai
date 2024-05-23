package kadai.kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18  {

	public void setGivenName() {
		givenName = "花子";
	}
	
	public void commonIntroduce(String familyName, String hanakoGivenName, String address) {
		System.out.println("名前は" + familyName + hanakoGivenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
	
	public void execIntroduce() {
		this.commonIntroduce("加藤", givenName, "東京都中野区〇×");
		this.eachIntroduce();
	}
}
