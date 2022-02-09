package com.poc.util

def call(Map pipelineParams)
{
SCMURL = "git@github.com:"+pipelineParams.GITGROUP+"/"+pipelineParams.REPO+".git"
sh '''
rm -rf ${REPO}
git clone --singlebranch --branch ${BRANCH} ${SCMURL}
'''
}