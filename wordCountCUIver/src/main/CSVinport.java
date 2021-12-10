package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVinport {
	private List<Words> wordBox;
	public void inport(String filePath) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(filePath);
			br=new BufferedReader(fr);
			wordBox=new ArrayList<Words>();

			try {
				String lineData=br.readLine();
				//取り込み処理
				while(lineData!=null) {
					System.out.println("取り込みデータ"+lineData);
					Words word=new Words((lineData.toString()));
					wordBox.add(word);
					lineData=br.readLine();

				}
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}
	public List<Words> getWordBox(){
		return this.wordBox;
	}


}
