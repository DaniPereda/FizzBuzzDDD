import application.FizzBuzzServiceImpl
import infra.FizzBuzzTranslator
import infra.HardcodeParameters

fun main(args: Array<String>) {

    FizzBuzzServiceImpl(FizzBuzzTranslator(), HardcodeParameters()).startFizzBuzz()

}