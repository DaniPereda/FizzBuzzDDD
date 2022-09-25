package application

import domain.FizzBuzz

class FizzBuzzServiceImpl(private val translator: LiteralsTranslator, private val inputParams:InputParameters):FizzBuzzService {

    override fun startFizzBuzz() {
        for (number in 1 .. inputParams.retrieveLastNumber())
            translator.translate(FizzBuzz(number))

    }

}