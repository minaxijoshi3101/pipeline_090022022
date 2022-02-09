import com.poc.util
def call(Map pipelineparams)
{
  pipeline
  {
    node("master")
    {
      stage("checkout SCM")
      {
       echo "stage to checkout the code from SCM")
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
