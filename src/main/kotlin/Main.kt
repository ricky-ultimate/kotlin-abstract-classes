fun main(){
    val rectangle  = Rectangle()
    val triangle = Triangle()

    rectangle.getPerimeter()
    println("")
    rectangle.getArea()
    lineSpace(1)
    lineBreak()

    lineSpace(1)

    triangle.getPerimeter()
    println("")
    triangle.getArea()
    lineSpace(1)
}

fun lineBreak(){
    println("----------------------------------------------")
}

fun lineSpace(i: Int){
  repeat(i){
      println("")
  }
}