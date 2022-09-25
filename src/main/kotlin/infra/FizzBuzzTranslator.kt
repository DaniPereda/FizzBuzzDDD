package infra

import application.LiteralsTranslator
import domain.FizzBuzz

class FizzBuzzTranslator:LiteralsTranslator {
    val FIZZ = "Fizz"
    val BUZZ = "Buzz"
    val FIZZBUZZ = "FizzBuzz"
    val consolePrinter = ConsolePrinter()

    override fun translate(fizzBuzz: FizzBuzz) {
        when(fizzBuzz.status)
        {
            FizzBuzz.Status.FIZZ -> consolePrinter.printFizzBuzzNumber("${fizzBuzz.number} - $FIZZ")
            FizzBuzz.Status.BUZZ -> consolePrinter.printFizzBuzzNumber("${fizzBuzz.number} - $BUZZ")
            FizzBuzz.Status.FIZZBUZZ -> consolePrinter.printFizzBuzzNumber("${fizzBuzz.number} - $FIZZBUZZ")
            FizzBuzz.Status.NUMBER -> consolePrinter.printFizzBuzzNumber("${fizzBuzz.number} - ${fizzBuzz.number}")
        }
    }
}