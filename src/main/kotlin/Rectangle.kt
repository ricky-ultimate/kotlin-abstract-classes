class Rectangle(
    private val length: Double,
    private val width: Double
): BaseCalculations() {

    constructor() : this(1.0,1.0)
    
    override fun getPerimeter() {
        val perimeter = 2 * (length * width)
        println("---Perimeter of the rectangle---")
        println("Length: $length")
        println("Width: $width")
        println("Perimeter = 2(length * width) = 2 ($length x $width) = $perimeter ")
    }

    override fun getArea() {
        val area = length * width
        println("---Area of the rectangle---")
        println("Length: $length")
        println("Width: $width")
        println("Area = length * width = $length x $width = $area ")
    }
}