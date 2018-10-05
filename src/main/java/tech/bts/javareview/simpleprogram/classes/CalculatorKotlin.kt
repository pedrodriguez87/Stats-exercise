package tech.bts.javareview.simpleprogram.classes

// The constructor is right next to the class
class CalculatorKotlin (var value : Double) {

    //Additional fields
    var operationCount : Int = 0

    // Methods
    fun add (x : Double) {
        this.value += x
        this.operationCount ++
    }

    fun div(x : Double) {
        this.value /= x
        this.operationCount ++
    }

    /**
     * Resets the value to 0
     * The operation count is not modified
     */
    fun clear() {
        this.value = 0.0
    }
}