package tournamentWinner

fun tournamentWinnerSolution2(competitions: List<List<String>>, results: List<Int>): String {
    val map = mutableMapOf<String, Int>()
    var highestValue = 0
    var winner = ""

    for(index in 0..competitions.size -1){
        val timesAgainst = competitions[index]
        var roundWinner = timesAgainst[0]

        if(results[index] == 0) roundWinner = timesAgainst[1]

        map[roundWinner] = if(map.containsKey(roundWinner)) map.getValue(roundWinner) + 3 else 0

        if(map.getValue(roundWinner) >= highestValue){
            highestValue = map.getValue(roundWinner)
            winner = roundWinner
        }
    }

    return winner
}