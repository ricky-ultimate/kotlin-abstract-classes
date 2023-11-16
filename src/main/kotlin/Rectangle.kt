class Rectangle(
    private val length: Double,
    private val width: Double
): BaseCalculations() {

    constructor() : this(1.0,1.0)
    
    override fun getPerimeter() {
        val perimeter = 2 * (length + width)
        println("---Perimeter of the Rectangle---")
        println("Length: ${length}cm")
        println("Width: ${width}cm")
        println("Perimeter = 2(length + width) = 2 (${length}cm + ${width}cm) = ${perimeter}cm ")
    }

    override fun getArea() {
        val area = length * width
        println("---Area of the Rectangle---")
        println("Length: ${length}cm")
        println("Width: ${width}cm")
        println("Area = length * width = ${length}cm x ${width}cm = ${area}cm^2 ")
    }
}