import org.taruts.workspaceGradlePlugin.WorkspacePluginExtension
import org.taruts.workspaceGradlePlugin.directory.impl.DashesDirectoryFactory

plugins {
    id("org.taruts.workspace") version "1.0.1"
}

configure<WorkspacePluginExtension> {

    gitHub {
        groupSeparator.set("-")
    }

    workspaceRemoteUrlPathPostfix.set("workspace")
    projectsParentDirectoryRelativePath.set(".")

    directoryFactory.set(DashesDirectoryFactory())
    //directoryFactory.set(ReplaceDirectoryFactory("_"))

    //workspaceProject("example/app", "example-app")
    //workspaceProject("example/dynamic-api", "example-dynamic-api")
    //workspaceProject("example/dynamic-dev", "example-dynamic-dev")
    //workspaceProject("example/dynamic-dev-kotlin", "example-dynamic-dev-kotlin")
    //workspaceProject("spring-boot-starter", "djig-spring-boot-starter")
    //workspaceProject("properties-spring-boot-starter", "djig-properties-spring-boot-starter")
    //workspaceProject("dynamic-api", "djig-dynamic-api")
}
