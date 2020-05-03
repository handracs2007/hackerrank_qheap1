import java.util.*

// https://www.hackerrank.com/challenges/qheap1/problem

fun main() {
    val data = mutableListOf<Int>()
    val minSet = TreeSet<Int>()

    val numOfCases = readLine()!!.toInt()

    for (i in 0 until numOfCases) {
        val commands = readLine()!!.split(" ")

        when (commands[0]) {
            "1" -> {
                data.add(commands[1].toInt())
                minSet.add(commands[1].toInt())
            }

            "2" -> {
                data.remove(commands[1].toInt())
                minSet.remove(commands[1].toInt())
            }

            "3" -> println(minSet.first())
        }
    }
}