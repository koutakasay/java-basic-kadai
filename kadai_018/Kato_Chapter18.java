package kadai.kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	//共通
	public void commonIntroduce() {
		System.out.println("名前は" + familyName +givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	//個別
	abstract public void eachIntroduce();
	//実行
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
}
