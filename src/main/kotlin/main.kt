import kotlin.random.Random

fun main(args: Array<String>) {
  
  for(numero in Ejer1(11).array){
        println(numero)
    }


    val ejer2 = Ejer2(10){
        Random.nextInt(50,250)
    }
    ejer2.array.forEach { println(it) }
    
    val ejer3 = Ejer3().array()


}