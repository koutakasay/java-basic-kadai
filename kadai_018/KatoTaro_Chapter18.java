package kadai.kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName() {
		givenName = "太郎";
	}
	
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
	
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}
}
