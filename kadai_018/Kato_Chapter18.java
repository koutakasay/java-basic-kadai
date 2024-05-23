package kadai.kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName;
	public String givenName;
	public String address;
	
	//共通
	public void commonIntroduce(String familyName, String eachGivenName, String address) {
		System.out.println(familyName + eachGivenName);
		System.out.println(address);
	}
	//個別
	abstract public void eachIntroduce();
	//実行
	public void execIntroduce() {
		this.commonIntroduce("加藤", "", "東京都中野区〇×");
		this.eachIntroduce();
	}
}
