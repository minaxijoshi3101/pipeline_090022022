package com.poc.util

def call(Map pipelineParams)
{
     withSonarQubeEnv('sonarqube')
        {
        sh'''
        cd ${REPO}
        echo "pwd is after repo "$PWD
        mvn sonar:sonar
        '''
        }
}