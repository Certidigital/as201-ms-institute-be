pipeline{
    agent any
    stages{
        stage("test"){
            steps{
                dir('AS201-MS-INSTITUTE-BE'){
                    sh "mvn complie clean test"
                }
            }
            post{
                always{
                    echo "Terminado"
                }
                success{
                    echo "Hecho, se ha ejecutado correctamente"
                }
                failure{
                    echo "Ha ocurrido un error en el stage"
                }
            }
        }
    }
    // post{
    //     always{
    //         echo "========always========"
    //     }
    //     success{
    //         echo "========pipeline executed successfully ========"
    //     }
    //     failure{
    //         echo "========pipeline execution failed========"
    //     }
    // }
}