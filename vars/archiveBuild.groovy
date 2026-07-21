def call(Map config = [:]){
    archiveArtifacts artifacts : "${config.folder}/**"
}