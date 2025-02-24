def call(String credentialId, String imageName, String tagName) {
  withCredentials([usernamePassword(credentialsId: "${credentialId}", usernameVariable: "dockerHubUser", passwordVariable: "dockerHubPass")]) {
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker push ${env.dockerHubUser}/${imageName}: ${tagName}"
  }
  
}
