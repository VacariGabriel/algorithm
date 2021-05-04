package sortedSquaredArray

fun sortedSquareArray(array: List<Int>): List<Int> {
    val output = array.map { _ -> 0 }.toMutableList()
    var smallIndex = 0
    var largeIndex = array.size - 1

    for (index in array.size - 1 downTo 0) {
        val smallerValue = array[smallIndex]
        val largerValue = array[largeIndex]

        if(Math.abs(smallerValue) > Math.abs(largerValue)) {
            output[index] = smallerValue * smallerValue
            smallIndex++
        } else {
            output[index] = largerValue * largerValue
            largeIndex--
        }
    }

    return output
}