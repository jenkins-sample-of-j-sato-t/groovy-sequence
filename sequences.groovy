def MakeArray(Integer inStart, Integer inEnd)
{
	def tempArray = []
	(inStart..inEnd).each
	{
		tempArray.push(it)
	}

	return tempArray
}

void DispArray(def inArray)
{
	String datas = ""

	inArray.each
	{
		datas += "${it}\r\n"
	}

	echo datas
}

Integer SumArray(def inArray)
{
	Integer sum = 0

	// 配列でのeachは上でやってるので別の方法でループ
	Integer size = inArray.size()
	for(i in 0..<size)
	{
		sum += inArray[i]
	}

	return sum
}



return this