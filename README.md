
# wordCountCUIver
Twitter4Jを利用して、単語でツイート検索を行い、その中にどれだけ指定した単語が含まれるかをカウントするプログラム。
個人的な研究に活用する目的で制作しました。

 
# DEMO
現在は「アイドルマスターシンデレラガールズ」のトレンド分析などに活用しているのですが、試しにアイドルの名前で検索をして、そのアイドルと同時にツイートされている回数の多い
アイドルを調べてみます。
CSVファイルのファイルパスを入力。
（伏せ字になっている部分にはユーザー名などが入ります）

![スクリーンショット 2021-12-10 15 36 34](https://user-images.githubusercontent.com/90515637/145529716-de481ca8-600e-45fa-b119-9ecacde7e187.png)

次に、調べたいアイドルの名前を入れます。


![スクリーンショット 2021-12-13 1 37 39](https://user-images.githubusercontent.com/90515637/145721114-76c9d656-07b2-4795-a9e5-58bcb4e979af.png)


結果が表示されます。
ここでは一部を抜粋してご紹介します。


![スクリーンショット 2021-12-13 0 32 32](https://user-images.githubusercontent.com/90515637/145721124-0996cd69-4e59-4f35-ae65-cc2ec12775cf.png)


# Features
 単語同士の関連性から、「あるものを好きな人はこれについても好きなのではないか」ということを調べるのに役立つのではないか、と考えてます。
 何故ならその単語は、ここで指定された単語と同時にツイートされているわけですから。
 ただ現時点では改善点が。
 
# Issue
現時点では1つ、大きな問題が。取得件数が100件であり、検索するタイミングによって結果が変わってしまいます。
例えばこれは砂塚あきらで検索した結果。
1枚目が12月10日の16時時点、2枚目が。12月13日の午前2時時点です。

![スクリーンショット 2021-12-10 16 04 59](https://user-images.githubusercontent.com/90515637/145722331-1ab7c84f-9c89-4906-832f-21cbdf506d36.png)



![スクリーンショット 2021-12-13 2 13 30](https://user-images.githubusercontent.com/90515637/145722312-eefda0d3-e8a7-4748-8053-a9971804a314.png)



この通り、全然結果が違う。
特に辻野あかりの部分に注目していただくと、その差は一目瞭然です。
有料版のAPIなら500件まで取得できるので数でカバーできるかもしれませんが、ただ現時点ではお財布事情がきついので有料版に手を出すのはキツそう、残念ながら。ちなみに我々が普通にTwitterを検索するときに使う（APIとかじゃなくてアプリから使うとき）特定の時間を指定するFrom、Untilはここでは使えませんでした。
 
# Requirement
 カウントしたい言葉を記載したCSVファイル、Twitter4J、TwitterAPIのトークン。
 
Twitter4J

https://twitter4j.org/ja/index.html

こちらから最新安定バージョンをダウンロードした後、プロジェクトフォルダにはJARを通してください。手前味噌ですが以下eclipseでJARを通すまで。

https://qiita.com/Louchura/items/fddd5c11ce0277dc5b8e
 
 
 TwitterAPIのトークン
 
 
 各自で取得しておく必要があります。このアプリを使うには、TwitterAPIv2を申請する必要があります。
 こちら https://blog.twitter.com/developer/en_us/topics/tools/2021/build-whats-next-with-the-new-twitter-developer-platform のリンク先の、

 "![スクリーンショット 2021-12-11 23 09 32](https://user-images.githubusercontent.com/90515637/145679600-33e6ce05-1930-44f9-b2e5-63221c611a4d.png)

 このくだりのapplyのリンクを踏むと申請ができます。
 
# Author

* Louchura
