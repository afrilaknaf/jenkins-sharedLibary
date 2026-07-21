def call(Map config = [:]){
    node(
        nodeversion : config.nodeversion,
        npmversion : config.npmversion
    )
}
