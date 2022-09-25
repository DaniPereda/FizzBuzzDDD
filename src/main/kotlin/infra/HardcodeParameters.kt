package infra

import application.InputParameters

class HardcodeParameters:InputParameters {
    val lastNumber = 100
    override fun retrieveLastNumber(): Int {
        return  lastNumber
    }


}