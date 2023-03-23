pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                //取消之前的构建
                script {
                    def previousBuild = currentBuild.previousBuild
                    if (previousBuild != null) {
                        cancelPreviousBuilds(currentBuild, 1)
                    }
                }
                
                //继续进行新的构建
                //...
            }
        }
    }
}
