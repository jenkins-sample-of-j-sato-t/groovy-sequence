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




return this