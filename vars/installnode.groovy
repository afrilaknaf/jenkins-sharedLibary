def call(Map config = [:]){
    bat '''
    echo Node.js Version Checked
    node -v
    echo NPM version checked
    npm -v
    '''
}
