def call(Map config = [:]){
    node(
        packagename : config.packagename
    )
}