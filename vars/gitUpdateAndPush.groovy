def call(String url, String gitCredential) {
  withCredentials([gitUsernamePassword(credentialsId: "${gitCredential}", gitToolName: "Default")]){
    sh '''
      git config --global user.name "rcheeez"
      git config --global user.email "archiesgurav10@gmail.com"
      git add .
      git commit -m "Update: Updated Environment Variables"
      git push ${url} dev
    '''
  }
}
