pipeline{
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