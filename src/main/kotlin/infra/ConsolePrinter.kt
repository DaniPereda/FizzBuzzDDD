package infra

import application.Printer

class ConsolePrinter: Printer {
    override fun printFizzBuzzNumber(message:String) {
        println(message)
    }
}