function findNextSquare(sq) {
    let isPerfectSquare = Math.sqrt(sq)

    if (Number.isInteger(isPerfectSquare))
        return Math.pow(++isPerfectSquare, 2)

    return -1;
}