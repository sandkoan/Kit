package libkit

import org.ini4j.Wini
import java.io.File


class GitRepository constructor(path: String = ".", force: Boolean = false) {
    private var confReader: Wini
    var worktree: File? = File(path.removeSuffix("/").removeSuffix("\\"))
    var gitdir: File? = File(this.worktree.toString() + "/.git")

    init {
        if (!force || !this.gitdir!!.isDirectory)
            Utils.fail("Not a Git repository $path")

        val confPath = File("${this.gitdir}/config")
        this.confReader = Wini(confPath)


        /*
        *
        cf = repo_file(self, "config")

        if cf and os.path.exists(cf):
                self.conf.read([cf])
        elif not force:
            raise Exception("Configuration file missing")

        if not force:
            vers = int(self.conf.get("core", "repositoryformatversion"))
            if vers != 0:
                raise Exception("Unsupported repositoryformatversion %s" % vers)




def repo_dir(repo, *path, mkdir=False):
    """Same as repo_path, but mkdir *path if absent if mkdir."""

    path = repo_path(repo, *path)

    if os.path.exists(path):
        if (os.path.isdir(path)):
            return path
        else:
            raise Exception("Not a directory %s" % path)

    if mkdir:
        os.makedirs(path)
        return path
    else:
        return None
        * */
    }


}

fun repoPath(repo: GitRepository, vararg path: String) = path.forEach { repo.gitdir.toString() + "/" + it }

fun repoFile(repo: GitRepository, vararg path: String, mkdir: Boolean = false) {
    if (repoDir(repo, *path.sliceArray(0..path.size - 2), mkdir = mkdir)) return repoPath(repo, *path)
}

fun repoDir(repo: GitRepository, vararg path: String, mkdir: Boolean = false): Boolean {
    val path: File = File(repoPath(repo, *path))
    if ()
}
