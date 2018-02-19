import java.util.*

fun main(args: Array<String>) {
    val bfs =  BreadthFirstSearch()
    fun find(t: Char) {
        System.out.println("============\nstart search \"$t\"")
        val nodes = bfs.find(t)
        System.out.println("found $nodes")
    }

    find('A')
    find('B')
    find('C')
    find('D')
    find('E')
    find('F')
    find('G')
    find('H')
    find('I')
    find('J')
    find('K')
    find('L')
    find('M')
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




