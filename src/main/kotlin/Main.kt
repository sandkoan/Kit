import libkit.Utils.Companion.fail

fun main(args: Array<String>) {
    if (args.isEmpty())
        fail(helpMessage)

    val slice = args.sliceArray(1..args.size)

    when (args[0]) {
        "add" -> cmdAdd(slice)
        "cat-file" -> cmdCatFile(slice)
        "checkout" -> cmdCheckout(slice)
        "commit" -> cmdCommit(slice)
        "hash-objec" -> cmdHashObject(slice)
        "init" -> cmdInit(slice)
        "log" -> cmdLog(slice)
        "ls-tree" -> cmdLsTree(slice)
        "merge" -> cmdMerge(slice)
        "rebase" -> cmdRebase(slice)
        "rev-parse" -> cmdRevParse(slice)
        "rm" -> cmdRm(slice)
        "show-ref" -> cmdShowRef(slice)
        "tag" -> cmdTag(slice)
        "version" -> print(version)
        else -> print(helpMessage)
    }
}


fun cmdTag(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdShowRef(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdRm(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdRevParse(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdRebase(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdMerge(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdLsTree(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdLog(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdInit(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdHashObject(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdCommit(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdCheckout(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdCatFile(args: Array<String>) {
    TODO("Not yet implemented")
}

fun cmdAdd(args: Array<String>) {
    TODO("Not yet implemented")
}


val helpMessage = """
    usage: kit [--version] [--help]

    These are common kit commands used in various situations:

    start a working area (see also: kit help tutorial)
       clone             Clone a repository into a new directory
       init              Create an empty kit repository or reinitialize an existing one

    work on the current change (see also: kit help everyday)
       add               Add file contents to the index
       restore           Restore working tree files
       rm                Remove files from the working tree and from the index

    examine the history and state (see also: kit help revisions)
       diff              Show changes between commits, commit and working tree, etc
       grep              Print lines matching a pattern
       log               Show commit logs
       show              Show various types of objects
       status            Show the working tree status

    grow, mark and tweak your common history
       branch            List, create, or delete branches
       commit            Record changes to the repository
       merge             Join two or more development histories together
       rebase            Reapply commits on top of another base tip
       reset             Reset current HEAD to the specified state
       switch            Switch branches

    collaborate (see also: kit help workflows)
       fetch             Download objects and refs from another repository
       pull              Fetch from and integrate with another repository or a local branch
       push              Update remote refs along with associated objects
    """.trimIndent()

const val version = "0.1.0"
