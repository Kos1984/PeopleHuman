fun main () {
    val likes = 1001

    val message = "понравилось $likes человеку"
    val message1 = "понравилось $likes людям"
    println(likes %10)


    if (likes %10 === 1 && likes != 11){
        println(message)
    }else {
        println(message1)
    }

}

