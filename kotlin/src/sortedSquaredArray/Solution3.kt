package sortedSquaredArray

fun sortedSquareArraySolutionThree(array: List<Int>): List<Int> {
    val output = mutableListOf<Int>()
    var smallIndex = 0
    var largeIndex = array.size - 1

    while(smallIndex <= largeIndex) {
        val smallerValue = array[smallIndex]
        val largerValue = array[largeIndex]

        if(Math.abs(smallerValue) > Math.abs(largerValue)) {
            output.add(smallerValue * smallerValue)
            smallIndex++
        } else {
            output.add(largerValue * largerValue)
            largeIndex--
        }
    }

    return output.asReversed()
}