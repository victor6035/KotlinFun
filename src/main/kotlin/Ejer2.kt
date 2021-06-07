class Ejer2(sizeArray: Int, arrayInit: (Int) -> Int) {


    var array = Array(
        size = sizeArray,
        arrayInit
    )
}