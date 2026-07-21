def call(Map config = [:]){
    packageManager:config.packageManager
    bat "echo package Manager:${packageManger}"
}