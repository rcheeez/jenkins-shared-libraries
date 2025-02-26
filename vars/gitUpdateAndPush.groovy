def call(String url, String gitCredential) {
  withCredentials([gitUsernamePassword(credentialsId: "${gitCredential}", gitToolName: "Default")]){
    sh '''
      git add .
      git commit -m "Update: Updated Environment Variables"
      git push ${url} main
    '''
  }
}
