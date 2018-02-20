import java.util.*

class BreadthFirstSearch(val graph: Node) {
    fun find(t: Char) : Char? {
        return graph.find(t)
    }
}

private fun Node.find(t: Char) : Char? {
    val q: Deque<Node> = ArrayDeque()
    q.add(this)
    return findRecur2(q, t)
}
private tailrec fun Node.findRecur(q: Deque<Node>, t: Char) : Char? {
    if (q.isEmpty()) return null
    val v = q.pop()
    System.out.println("search:${v.c}")
    if (v.c == t) return v.c
    else if (v.hasChildren())
        q.addAll(v.children)
    return findRecur(q, t)
}

private fun Node.findRecur2(q: Deque<Node>, t: Char) : Char? =
    if (q.isEmpty())  null
    else q.pop().let { current ->
        System.out.println("search:${current.c}")
        if (current.c == t)
            return@let current.c
        if (current.hasChildren())
            q.addAll(current.children)
        return@let findRecur2(q, t)
    }


private fun Node.hasChildren() : Boolean {
    return this.children.isNotEmpty()
}