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
	inArray.each
	{
		echo it
	}
}




return this