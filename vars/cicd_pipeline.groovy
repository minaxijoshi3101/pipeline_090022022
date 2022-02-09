import com.poc.util.checkoutSCM;

def call(Map pipelineParams)
{
  env.GITGROUP = pipelineParams.GITGROUP
  env.REPO = pipelineParams.REPO
  env.BRANCH = pipelineParams.BRANCH
  pipeline
  {
    node("master")
    {
      stage("checkout SCM")
      {
       echo "stage to checkout the code from SCM"
       new checkoutSCM().call(pipelineparams)
      }
        stage("builld the code and create the docker image")
        {
          echo "build the code"
        }
      stage("source code analysis")
      {
        echo "analyse the source code"
      }
      stage("push docker image to docker registry")
      {
        echo "push docker image to. docker registry"
      }
 
    }
    node ("SIT")
    {
      stage("deploy image")
      echo "deploy the image to SIT env and run the container "
    }
  }
  
}
