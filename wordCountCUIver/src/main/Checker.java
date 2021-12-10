package main;

import java.util.List;

public class Checker {
	private List<Words> words;
	private List<String> checked;

	//コンストラクタ
	public Checker(List<Words> words,List<String> checked) {
		setWords(words);
		setChecked(checked);
	}

	public void check() {
		List<Words> words2=getWords();
		List<String> checked2=getChecked();

		for(Words word:words2) {
			String searchWord=word.getName();
			//searchWord:数を数えたい言葉
			//checkWord:検証したいツイート
			for(String checkWord:checked2) {
				boolean content=checkWord.contains(searchWord);
				if(content==true) {
					word.plusPoint();
				}
			}
		}
	}
	public void showResult() {
		for(Words word:words) {
			int point=word.getPoint();
			if(point>0) {
				word.showPoint();
			}

		}

	}

	public List<Words> getWords() {
		return this.words;
	}
	public void setWords(List<Words> words) {
		this.words=words;
	}
	public List<String> getChecked() {
		return this.checked;
	}
	public void setChecked(List<String> checked) {
		this.checked=checked;
	}


}
