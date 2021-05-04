package sortedSquaredArray

fun sortedSquareArraySolutionTwo(array: List<Int>): List<Int> {
    return array.map { it * it}.sorted()
}