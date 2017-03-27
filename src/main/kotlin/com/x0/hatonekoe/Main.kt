package com.x0.hatonekoe

fun main(args: Array<String>) {
    moveDisc(4, 'A', 'B', 'C')
}

/* http://www13.plala.or.jp/kymats/study/C++/Hanoi/Hanoi.html より */
fun moveDisc(discNumber: Int, fromPole: Char, workingPole: Char, toPole: Char) {
    if (discNumber > 0) {
        moveDisc(discNumber - 1, fromPole, toPole, workingPole)
        println(discNumber.toString() + "を" + fromPole + "から" + toPole + "へ")
        moveDisc(discNumber - 1, workingPole, fromPole, toPole)
    }
}

/** ハノイの塔の最短手数を返す */
fun moveDiscWithCount(discNumber: Int, count: Int = 0): Int {
    var counter = count

    if (discNumber > 0) {
        ++counter
        counter = moveDiscWithCount(discNumber - 1, counter)
        counter = moveDiscWithCount(discNumber - 1, counter)
    }
    return counter
}
