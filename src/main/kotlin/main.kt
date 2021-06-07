import kotlin.random.Random

fun main(args: Array<String>) {

    val ejer2 = Ejer2(10){
        Random.nextInt(50,250)
    }
    ejer2.array.forEach { println(it) }
}