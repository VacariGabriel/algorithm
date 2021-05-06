package tournamentWinner

const val HOME_WON = 1
const val POINTS = 3

fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    var mostVictory = ""
    val teams = mutableMapOf(mostVictory to 0)

    for (index in 0..competitions.size-1) {
        val (homeTeam, awayTeam) = competitions[index]

        val winning = if(results[index] == HOME_WON) homeTeam else awayTeam

        if(!teams.containsKey(winning)) teams[winning] = 0

        teams[winning] = teams[winning]!! + POINTS

        if(teams[winning]!! > teams[mostVictory]!!) mostVictory = winning
    }

    return mostVictory
}