def call(Map config = [:]){
    bat '''
    echo Running the forntend build command
    ${config.buildcommand}
    '''
}