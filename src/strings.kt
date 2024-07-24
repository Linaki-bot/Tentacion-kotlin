fun main () {

    var firstname = "Lizminah"
    var lastname = "Nanjala"

    println(firstname)

    //Accessing a character in a string
    println(firstname[1])

    //Modifying a string
    println(firstname.uppercase())
    println(lastname.lowercase())

    //String concatenation - Joining strings
    println(firstname + lastname)
    println(firstname+" "+lastname)
    println(firstname.plus(lastname))

    //String Interpolation
    println("My firstname is "+firstname)
    println("My firstname is $firstname")

    var num1 = 34
    var num2 = 20

    println("The sum of $num1 and $num2 is "+(num1 + num2))


}