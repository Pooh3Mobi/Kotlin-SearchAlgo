

class DepthFirstSearch(val graph: Node) {
    fun find(t: Char) : Char? {
        return graph.find(t)?.c
    }
}

private fun Node.find(t: Char) : Node? =
        also { System.out.println("search:${c}") }
                .let {
                    if (t == c) this
                    else children.asSequence()
                            .map { node -> node?.find(t) }
                            .filterNotNull()
                            .firstOrNull()
                }
