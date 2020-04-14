# groovy-sequence
groovyの制御構文練習（実行はjenkins上）

## 想定

- ループ
	- 数値指定
	- 配列foreach
	- マップforeach
	- ~~while~~

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
```
### マップを使ったループ
```groovy
map.each{
	// itがオブジェクトになっている
	// キー→ it.key , 値→ it.value
}
```
