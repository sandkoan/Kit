package libkit

import com.sksamuel.hoplite.ConfigLoader
import com.sksamuel.hoplite.PropertySource
import java.io.File
import java.io.ObjectInputFilter

class GitRepository constructor(path: String = ".", force: Boolean = false) {
    var worktree: File? = null
    var gitdir: File? = null
    var conf = null

    init {
        this.worktree = File(path.removeSuffix("/").removeSuffix("\\"))
        this.gitdir = File(this.worktree.toString() + "/.git")
        if (!force || !this.gitdir!!.isDirectory)
            Utils.fail("Not a Git repository $path")

        this.conf = ConfigLoader.Builder()
            .addSource(PropertySource.resource("${this.gitdir}/config", true))
            .build()
            .loadConfig<Config>()
    }

}