package libkit

import org.ini4j.Wini
import java.io.File


class GitRepository constructor(path: String = ".", force: Boolean = false) {
    private var conf: Wini
    var worktree: File? = File(path)
    var gitdir: File? = File(this.worktree.toString() + "/.git")


    init {
        if (!(force || this.gitdir!!.isDirectory))
            Utils.fail("Not a Git repository $path")

        val confPath = File("${this.gitdir}/config")

        if (!confPath.isFile)
            Utils.fail("Configuration file missing")


        this.conf = Wini(confPath)
    }
}

