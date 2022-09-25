package domain

data class FizzBuzz(val number:Int) {
    val status:Status = fizzBuzzing()


    private fun fizzBuzzing():Status{
        return if(isFizzBuzz()){
            Status.FIZZBUZZ
        }else if(isFizz()){
            Status.FIZZ
        }else if(isBuzz() == 0) {
            Status.BUZZ
        }else
            Status.NUMBER
    }

    private fun isBuzz() = number % 5

    private fun isFizz() = number % 3 == 0

    private fun isFizzBuzz() = number % 15 == 0

    enum class Status{
        FIZZ,
        BUZZ,
        FIZZBUZZ,
        NUMBER
    }
}