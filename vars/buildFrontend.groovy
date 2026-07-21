def call(Map config = [:]){
    bat '''
    echo Running the forntend build command
    npm run build
    '''
}