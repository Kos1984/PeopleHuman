fun main() {
    val likes = 2011
    val message = "понравилось $likes человеку"
    val message1 = "понравилось $likes людям"

    if (likes % 100 == 11){
        println(message1)
    }else if (likes % 10 == 1 ) {
        println(message)
    } else {
        println(message1)
    }
}

