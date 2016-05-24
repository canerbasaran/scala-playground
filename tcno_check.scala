val select = (list:Seq[Int], start:Int, end:Int, step:Int) => for (i <- (start until end by step).toList) yield list(i)
def check(tc_no: String): Boolean = {
    val list_tc = tc_no.map(_.asDigit)
    val tc10 = (select(list_tc, 0, 10, 2).sum*7 - select(list_tc, 1, 9, 2).sum) % 10
    val tc11 = (list_tc.slice(0, 9).sum + tc10) % 10
    if (list_tc(9) == tc10 & list_tc(10) == tc11) true else false
}
