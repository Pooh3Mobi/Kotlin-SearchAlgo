
class NodeFactory {
    companion object {
        fun test(): Node {

            // tree
            // [a b], [a, c], [a, d]
            // [b, e], [b, f]
            // [c, h]
            // [d, i], [d, j]
            // [e, k]
            // [h, g]
            // [j, l]
            // find g = [a, c],[c, h], [h, g]

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
            return a
        }
    }
}
