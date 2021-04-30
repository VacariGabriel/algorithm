package validateSubsequence


fun validateSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var arrayIndex = 0
    var sequenceIndex = 0

    while (arrayIndex < array.size && sequenceIndex < sequence.size) {
        if (sequence[sequenceIndex] == array[arrayIndex]) {
            sequenceIndex++
        }
        arrayIndex++
    }

    return sequenceIndex == sequence.size
}

