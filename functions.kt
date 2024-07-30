fun main() {

    //Predefined function
    println("eMobilis")

    var squareroot = Math.sqrt(144.0)
    println("The squareroot is $squareroot")

    var round = Math.round(32.89)
    println("The final output is $round")

    var myceil = Math.ceil(45.67)
    println(myceil)

    month()
    multiply()
    student("Jahleel",19)
    student("Lishan",17)

}
//User-Defined Functions
fun month(){
    println("The month is July")
}

fun multiply(){
    var num1 = 20
    var num2 = 5
    println(num1 * num2)
}
//Parameter and Arguments
fun student(name:String,age:Int){
    println("My ")
}