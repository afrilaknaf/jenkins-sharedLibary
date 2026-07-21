def call(Map config = [:]){
    bat "echo package Manager:${config.packageManager}"
    bat "echo ${config.packageManager} install " 
}
