fun main(args: Array<String>) {

    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')

    val (a, b, c) = readLine()!!.split(" ").map { it.toDouble() }

    val p = ( a + b  +  c ).format(1)

    val r = ( ( ( a + b ) * c  / 2 ) ).format(1)

    if ( c  < ( a + b ) && b  < (a  + c ) && a  < ( b + c  ) ) println("Perimetro = $p")

    else println("Area = $r")

}