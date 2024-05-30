package kadai.kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 extends JyankenExec_Chapter26 {

	HashMap<String, String> jyankenPlay = new HashMap<String, String>();
	
	// 自分の手の入力
    public String getMyChoice() {
    	System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        Scanner scanner = new Scanner(System.in);
        //自分の手を返す変数
        String choice = "";
        //配列に対して一致しているかの変数
        boolean validInput = false;
        String[] validChoices = {"r", "s", "p"};
        //choiceが配列内の文字列と一致していれば、true判定にしてwhile文を終了
        while(!validInput) {
        	choice = scanner.nextLine();
        	for(String myHand : validChoices) {
        		if(choice.equals(myHand)) {
        			validInput = true;
        			break;
        		}
        	}
        	//配列内にない文字列の場合、falseのままなのでエラーを表示し、再度入力を求める
        	if(!validInput) {
        		System.out.println("エラーです、もう一度入力してください");
        	}
        }
        scanner.close();
        return choice;
    }

    // 相手の手をランダム選択
    public String getRandom() {
        Random random = new Random();
        // 0から2の範囲の乱数を生成
        int number = random.nextInt(3); 
        String[] enemyChoices = {"r", "s", "p"};
        return enemyChoices[number];
    }
	
    // じゃんけんする
    public void playGame(String myChoice, String enemyChoice) {
    	jyankenPlay.put("r", "グー");
        jyankenPlay.put("s", "チョキ");
        jyankenPlay.put("p", "パー");

        // 自分と相手の手を表示
        System.out.print("自分の手は" + jyankenPlay.get(myChoice) + ",");
        System.out.println("対戦相手の手は" + jyankenPlay.get(enemyChoice));

        // 結果の判定
        if (myChoice.equals(enemyChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("r") && enemyChoice.equals("s"))
                || (myChoice.equals("s") && enemyChoice.equals("p"))
                || (myChoice.equals("p") && enemyChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
        
        
    }
}
