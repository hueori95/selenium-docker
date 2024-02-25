pipeline{
    agent any
    stages {
        stage('stage-1'){
            steps{
                sh "mvn clean pakage -DskipTests"
            }
        }
        stage('stage-2'){
            steps{
                sh "docker build -t=vinsdocker/selenium ."
            }
        }
        stage('stage-3'){
            steps{
                sh "docker push vinsdocker/selenium"
            }
        }
    }
    post {
        always {
            echo "doing clean up"
        }
    }
}