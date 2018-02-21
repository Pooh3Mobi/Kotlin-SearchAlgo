
fun main(args: Array<String>) {
    val bfs =  BreadthFirstSearch(NodeFactory.test())
    fun findBfs(t: Char) {
        println("============\nstart bfs search \"$t\"")
        val node = bfs.find(t)
        println("found $node")
    }

    findBfs('A')
    findBfs('B')
    findBfs('C')
    findBfs('D')
    findBfs('E')
    findBfs('F')
    findBfs('G')
    findBfs('H')
    findBfs('I')
    findBfs('J')
    findBfs('K')
    findBfs('L')
    findBfs('M')

    val dfs = DepthFirstSearch(NodeFactory.test())
    fun findDfs(t: Char) {
        println("============\nstart dfs search \"$t\"")
        val node = dfs.find(t)
        println("found $node")
    }
    findDfs('A')
    findDfs('B')
    findDfs('C')
    findDfs('D')
    findDfs('E')
    findDfs('F')
    findDfs('G')
    findDfs('H')
    findDfs('I')
    findDfs('J')
    findDfs('K')
    findDfs('L')
    findDfs('M')
//            found A
//            found B
//            found C
//            found D
//            found E
//            found F
//            found G
//            found H
//            found I
//            found J
//            found K
//            found L
//            found null
}




