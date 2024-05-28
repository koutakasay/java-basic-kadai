package kadai.kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 extends DictionaryExec_Chapter21 {

	HashMap<String, String> index = new HashMap<String, String>();
	String[] word;
	
	public Dictionary_Chapter21() {
		index.put("apple", "りんご");
		index.put("peach", "桃");
		index.put("banana", "バナナ");
		index.put("lemon", "レモン");
		index.put("pear", "梨");
		index.put("kiwi", "キウイ");
		index.put("strawberry", "いちご");
		index.put("grape", "ぶどう");
		index.put("muscat", "マスカット");
		index.put("cherry", "さくらんぼ");
	}
	
	public void checkIndex() {
		for(int i = 0; i < word.length; i++) {
			switch(word[i]) {
				case "apple" -> System.out.println("appleの意味は" + index.get("apple"));
				case "peach" -> System.out.println("appleの意味は" + index.get("peach"));
				case "banana" -> System.out.println("appleの意味は" + index.get("banana"));
				case "lemon" -> System.out.println("appleの意味は" + index.get("lemon"));
				case "pear" -> System.out.println("appleの意味は" + index.get("pear"));
				case "kiwi" -> System.out.println("appleの意味は" + index.get("kiwi"));
				case "strawberry" -> System.out.println("appleの意味は" + index.get("strawberry"));
				case "grape" -> System.out.println("appleの意味は" + index.get("grape"));
				case "muscat" -> System.out.println("appleの意味は" + index.get("muscat"));
				case "cherry" -> System.out.println("appleの意味は" + index.get("cherry"));
				default -> System.out.println(word[i] + "は辞書に存在しません");
			}
		}
	}
}
