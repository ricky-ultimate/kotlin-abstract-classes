class Triangle(
    private val lenA: Double,  //first side
    private val lenB: Double,  //second side
    private val base: Double,  //base (bottom side)
    private val height: Double
): BaseCalculations() {

    constructor(): this(1.0,1.0,1.0,1.0)


    override fun getPerimeter() {
        val perimeter = lenA + lenB + base
        println("---Perimeter of the Triangle---")
        println("a: ${lenA}cm")
        println("b: ${lenB}cm")
        println("c: ${base}cm")
        println("Perimeter = a + b + c = ${lenA}cm + ${lenB}cm + ${base}cm = ${perimeter}cm")
    }
    override fun getArea() {
        val area = 0.5 * base * height
        println("---Area of the Triangle---")
        println("b: ${base}cm")
        println("h: ${height}cm")
        println("Area = 1/2 x b x h = 1/2 x ${base}cm x ${height}cm = ${area}cm^2")
    }
}