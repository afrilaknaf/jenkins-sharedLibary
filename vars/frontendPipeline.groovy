def call(Map config = [:]){
    
    
    checkoutSCm(
        url:config.url,
        branch:config.branch ?: "master"
    )

    installnode()

    installpackage(
        packageManager:config.packageManager
    )

    buildFrontend(
        buildCommand:config.buildCommand
    )

    archiveBuild(
       folder:config.folder
    )

}