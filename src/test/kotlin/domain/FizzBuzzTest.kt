package domain

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun `Fizzbuzz returned number with number 13`(){
        //GIVEN
        val myFizzBuzz = FizzBuzz(13)
        //WHEN

        //THEN
        assertEquals(13, myFizzBuzz.number)
    }

    @Test
    fun `Fizzbuzz returned status with number 1`(){
        //GIVEN
        val result = FizzBuzz.Status.NUMBER
        val myFizzBuzz = FizzBuzz(1)
        //WHEN

        //THEN
        assertEquals(result, myFizzBuzz.status)
    }

    @Test
    fun `Fizzbuzz returned status with number 3`(){
        //GIVEN
        val result = FizzBuzz.Status.FIZZ
        val myFizzBuzz = FizzBuzz(3)
        //WHEN

        //THEN
        assertEquals(result, myFizzBuzz.status)
    }

    @Test
    fun `Fizzbuzz returned status with number 5`(){
        //GIVEN
        val result = FizzBuzz.Status.BUZZ
        val myFizzBuzz = FizzBuzz(5)
        //WHEN

        //THEN
        assertEquals(result, myFizzBuzz.status)
    }

    @Test
    fun `Fizzbuzz returned status with number 15`(){
        //GIVEN
        val result = FizzBuzz.Status.FIZZBUZZ
        val myFizzBuzz = FizzBuzz(15)
        //WHEN

        //THEN
        assertEquals(result, myFizzBuzz.status)
    }
}