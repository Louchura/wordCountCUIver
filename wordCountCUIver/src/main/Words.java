package main;

public class Words {
	private String name;
	private int point;

	//コンストラクタ
	public Words(String name) {
		setName(name);
	}
	//ポイント加算用メソッド
	public void plusPoint() {
		int calcPoint=getPoint();
		calcPoint++;
		setPoint(calcPoint);
	}
	//結果表示
	public void showPoint() {
		System.out.println(getName()+":"+getPoint());
	}
	//フィールド変数取得用メソッド
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPoint() {
		return this.point;
	}
	public void setPoint(int point) {
		this.point=point;
	}

}
