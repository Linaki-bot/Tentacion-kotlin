open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

class Rhombus:Shape(){
   override fun draw(){
        println("Drawing a rhombus")
    }
}

class Parallelogram:Shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main(){
    var myshape = Shape()

    var myrhombus= Rhombus()
    myrhombus.draw()

    var myparallelogram = Parallelogram()
    myparallelogram.draw()
}