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
	}
	post{
		always{
			echo "========always========"
			cleanWS
		}
		success{
			echo "========pipeline executed successfully ========"
		}
		failure{
			echo "========pipeline execution failed========"
		}
	}
}