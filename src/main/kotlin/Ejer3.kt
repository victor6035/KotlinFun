class Ejer3 {

    fun array(){
        val array = { array: Array<Int> ->
            array.filter {
                it % 2 != 0
            }.forEach{
                println(it)
            }
        }
    }

}