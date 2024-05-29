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
			String name = index.get(word[i]);
			
			if(!(name == null)) {
				System.out.println(word[i] + "の意味は" + name);
			} else {
				System.out.println(word[i] + "は辞書には存在しません");
			}
		}
	}
}
