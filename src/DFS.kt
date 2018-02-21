

class DepthFirstSearch(val graph: Node) {
    fun find(t: Char) : Char? {
        return graph.find(t)?.c
    }
}

private fun Node.find(t: Char) : Node? {
    System.out.println("search:${c}")
    if (t == c) return this
    else return children.asSequence()
                .map { node -> node?.find(t) }
                .filterNotNull()
                .firstOrNull()
}