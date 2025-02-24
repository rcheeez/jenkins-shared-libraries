def call(String dockerHubUser, String imageName) {
  sh "docker build -t ${dockerHubUser}/${imageName} ."
}
