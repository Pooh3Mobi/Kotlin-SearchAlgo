import java.util.*

class BreadthFirstSearch {
    // tree
    // [a b], [a, c], [a, d]
    // [b, e], [b, f]
    // [c, h]
    // [d, i], [d, j]
    // [e, k]
    // [h, g]
    // [j, l]
    // find g = [a, c],[c, h], [h, g]
    lateinit var graph: Node

    init {
        // g goal
        val g = Node('G')
        // l
        val l = Node('L')
        // k
        val k = Node('K')
        // j
        val j = Node('J', l)
        // i
        val i = Node('I')
        // h
        val h = Node('H', g)
        // f
        val f = Node('F')
        // e
        val e = Node('E', k)
        // d
        val d = Node('D', i, j)
        // c
        val c = Node('C', h)
        // b
        val b = Node('B', e, f)
        // a
        val a = Node('A', b, c, d)
        graph = a
    }

    fun find(t: Char) : Char? {
        return graph.find(t)
    }
}

private fun Node.find(t: Char) : Char? {
    val q: Deque<Node> = ArrayDeque()
    q.add(this)
    return findRecur3(q, t)
}
private fun Node.findRecur(q: Deque<Node>, t: Char) : Char? {
    if (q.isEmpty()) return null

    val v = q.pop()
    System.out.println("search:${v.c}")
    if (v.c == t) return v.c
    else if (v.children.isNotEmpty())
        q.addAll(v.children)
    return findRecur(q, t)
}

private tailrec fun Node.findRecur2(q: Deque<Node>, t: Char) : Char? =
    if (q.isEmpty())  null
    else {
        val v = q.pop()
        if (v.c == t){
            v.c
        } else if (v.children.isNotEmpty()) {
            q.addAll(v.children)
        }
        findRecur2(q, t)
    }

private fun Node.findRecur3(q: Deque<Node>, t: Char) : Char? =
    if (q.isEmpty())  null
    else q.pop().let { current ->
        System.out.println("search:${current.c}")
        if (current.c == t)
            return@let current.c
        if (current.hasChildren())
            q.addAll(current.children)
        return@let findRecur3(q, t)
    }


private fun Node.hasChildren() : Boolean {
    return this.children.isNotEmpty()
}