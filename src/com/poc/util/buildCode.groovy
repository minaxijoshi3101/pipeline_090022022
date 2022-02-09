package com.poc.util

def call(Map pipelineParams)
{
    sh '''
    cd ${REPO}
    mvn clean install
    #build image from dockerfile
    docker build -t my-app .
    '''
}