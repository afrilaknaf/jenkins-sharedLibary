def call(Map config = [:]){
    bat "echo package Manager:${config.packageManager}"
    bat "${config.packageManager} install " 
}
