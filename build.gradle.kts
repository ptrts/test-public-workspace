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
    //projectsParentDirectoryRelativePath.set("projects")

    directoryFactory.set(DashesDirectoryFactory())
    //directoryFactory.set(ReplaceDirectoryFactory("_"))

    workspaceProject("project1", "1")
    workspaceProject("project2", "2")
}
