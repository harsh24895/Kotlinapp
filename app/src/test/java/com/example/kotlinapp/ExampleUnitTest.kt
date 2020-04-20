package com.example.kotlinapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    fun Division(X: Float, Y: Float): Float {
        return X / Y
    }

    @Test
    fun Div() {
        println(Division(55.0F, 315.5F))

    }
//imp//
    fun printSum(a:Int,b:Int,c:Int)=a+b+c/3
    @Test
    fun main(){
        println("sum of 2 and 3 and 4is ${printSum(2,3,4)}")
    }
    @Test
    fun mainn(){
    val a:Int=1
    val b=2

    val c=5
    // var c=4
        println("a=$a and $b and $c")
    }

    fun max2(a:Int,b:Int):Int{
        if(a>b){
            return a;
        }
        else{
            return b;
        }}

        @Test
        fun mai(){
            println("max of 2 and 6 is ${max2(2,6)}")
        }


    fun maxxx(a:Int,b:Int)=if (a>b)a else b

    @Test
    fun test(){
        println("max of 2 and 6 is ${maxxx(2,0)}")
    }



    //string

    fun getStringLength(ob:Any):Int?{
        if(ob is String){
            return ob.length
        }
        return null
    }

    @Test
    fun man(){
        fun printLength(ob: Any){
            println(" '$ob' string length is ${getStringLength(ob)?:"...err,not a String}"}")

        }
        //length of the string
        printLength("incomprehensibilities")
        printLength(1000)
        printLength(listOf(Any()))
    }

    //loop
    @Test
    fun loop() {
        val items = listOf("apple", "windows");
        for (index in items){
            println("company are${items}")
        }
    }

    @Test
    fun mammn(){
        val x=10;
        val y=93;
        if(x in 1..y+1){
            println("fits in range");
        }


    }

    fun parse(str:String):Int?{
        return str.toIntOrNull()//if string is not valid parse the number for that
    }

    fun printProduct(arg1:String,arg2:String){
        val x=parse(arg1)
        val y=parse(arg2)


    if(x!=null&&y!=null){
        print(x*y)
    }
    else{
        print("either 'args1' or'arg2' is not number")
    }}

    @Test
    fun min(){
        printProduct("6","9")
        printProduct("H","R")
        printProduct("3","5")
    }


    fun second(int:Any):Int?{
        if(int!is String)return null
        return int.length
    }
    @Test
    fun mainnn(){
        fun printLength(int:Any){

            println("'$int' string length is ${second(int)?:"..err,not a String)"}")
        }
        printLength(2)
        printLength(1000)
        printLength(listOf(Any()))
    }

    @Test
    fun test(para:Int){
        val result=if (para==1){
            "one"
        }else if (para==2){
            "two"
        }else{
            "three"
        }

    }

    class Person constructor(name:String){
        
    }
}
