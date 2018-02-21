

class DepthFirstSearch(val graph: Node) {
    fun find(t: Char) : Char? {
        return graph.find(t)?.c
    }
}

private fun Node.find(t: Char) : Node? {
    System.out.println("search:${c}")
    if (t == c) return this
    else  {
        var node: Node? = null
        if (children.isNotEmpty()) {
            for (child in children) {
                node = child?.find(t)
                if (node != null) return node
            }
        }
        return null
    }
}