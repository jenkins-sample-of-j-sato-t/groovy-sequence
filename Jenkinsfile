pipeline{
	parameters{
		booleanParam(name: "UseDouble", defaultValue: false, description: "配列の各要素を2倍にするか")
	}
	agent{
		label "master"
	}
	stages{
		stage("load script"){
			steps{
				script{
					sequenceScript = load "sequences.groovy"
				}
			}
		}
		stage("make array from loop"){
			steps{
				script{
					datas = sequenceScript.MakeArray(1,10)
					echo "made array"
				}
			}
		}
		stage("element double array"){
			steps{
				script{
					if(params.UseDouble){
						datas = sequenceScript.ElementDouble(datas)
						echo "element is doubled"
					}else{
						echo "skip double"
					}
				}
			}
		}
		stage("disp array"){
			steps{
				script{
					sequenceScript.DispArray(datas)
				}
			}
		}
		stage("sum array"){
			steps{
				script{
					def sum = sequenceScript.SumArray(datas)
					echo "sum : ${sum}"
				}
			}
		}

		stage("make map"){
			steps{
				script{
					map = sequenceScript.MakeMap()
					echo "made map"
				}
			}
		}
	}
	post{
		always{
			echo "========always========"
			cleanWs notFailBuild: true
		}
		success{
			echo "========pipeline executed successfully ========"
		}
		failure{
			echo "========pipeline execution failed========"
		}
	}
}