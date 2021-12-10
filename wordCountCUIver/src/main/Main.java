package main;

import java.util.List;

public class Main {
	public static void main(String[]args) {
		System.out.println("調べたい単語を含むファイルのパスを入力してください");
		CSVinport input=new CSVinport();
		input.inport(new java.util.Scanner(System.in).nextLine());
		//この時点ではリストはinputインスタンスのフィールドにあり
		TwitterSearch search=new TwitterSearch();
		System.out.println("チェックしたいツイートの単語を検索してください");
		List<String> checked=search.searching(new java.util.Scanner(System.in).nextLine());
		//チェック用インスタンスを生成。
		Checker checking=new Checker(input.getWordBox(),checked);
		//数えたい単語群のインスタンスのフィールドの内容をgetterで取得。
		//checkingインスタンスのフィールドにコピーされる。
		//wordインスタンスの値が変更されたものを保持するリストは、checkingインスタンスのフィールドとして存在。
		//チェックを実行
		checking.check();
		//結果を表示
		checking.showResult();

	}

}
