package libkit

import com.sksamuel.hoplite.ConfigLoader
import com.sksamuel.hoplite.PropertySource
import java.io.File

class GitRepository constructor(path: String = ".", force: Boolean = false) {
    var worktree: File? = null
    var gitdir: File? = null
    var conf = null

    init {
        this.worktree = File(path.removeSuffix("/").removeSuffix("\\"))
        this.gitdir = File(this.worktree.toString() + "/.git")
        if (!force || !this.gitdir!!.isDirectory)
            Utils.fail("Not a Git repository $path")

        // read config file in .git/config
        this.conf = ConfigLoader.Builder().
        addSource(PropertySource.file(File("$this.gitdir/config"))).build().loadConfig<>()
    }

}