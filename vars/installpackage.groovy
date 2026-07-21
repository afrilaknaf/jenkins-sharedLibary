def call(Map config = [:]){
  def packageManager:config.packageManager
    bat "echo package Manager:${packageManger}"
}
