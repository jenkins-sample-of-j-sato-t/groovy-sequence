# groovy-sequence
groovyの制御構文練習（実行はjenkins上）

## 想定

- ループ
	- 数値指定
	- 配列foreach
	- マップforeach
	- ~~while~~

## コレクション

### リスト（配列）

```groovy
// 宣言
List list = [0,1,2,3]

// 追加
list.push(4)

// 検索
// 最初に見つけた要素が返る
assert list.find {it % 2 == 1} == 1
// 見つかったすべての要素が返る（結果は必ず配列で返る）
assert list.findAll {it % 2 == 1} == [1,3]

// 全要素に対して処理を行い、その結果を配列で返す
List list1 = [1,2,3]
List list2 = list1.collect { it * 2}
assert list2 == [2,4,6]

// 全要素を使って処理を行い、最終結果を返す
List list1 = [1,2,3]
Integer sum = list1.inject {a,b -> a+b}
assert sum == 6
Integer max = list1.inject {a,b -> a>b ? a : b}
assert max == 3
/**
	1. 初回は0と1番目の要素がそれぞれa,bに入り処理が実行される
	2. N(N>=2)回目は前回の結果がaに、N番目の要素がbに入り処理が実行される
	3. (2.)を要素が無くなるまで繰り返し、無くなったときの結果を最終結果として返す
 */
```

### マップ

```groovy
// 宣言
Map map = [first: 10, second: 20]

// 追加・上書き
map["third"] = 30
map["first"] = 15

// 取り出し
assert map.first == 15
assert map.get("second") == 20
assert map["third"] == 30
```

## ループ

### 普通のfor

```groovy
for(Integer i = 0; i < MAX; i++){
	// 添字などでiを使う処理
}
```

### 範囲を指定するfor-in

```groovy
// 1~5
for(i in 1..5){}

// 0~5未満（配列のサイズを使うときなど）
for(i in 0..<5){}
```

### 配列を使ったループ

```groovy
// for-in
for(data in array){
	// dataに入った要素を使う処理
}

// foreach
array.each{
	// it に入った要素を使う処理
}

// 型指定foreach
array.each{Integer val ->
	// valに入った整数型要素を使う処理
}
```
### マップを使ったループ
```groovy
map.each{
	// itがオブジェクトになっている
	// キー→ it.key , 値→ it.value
}
```
