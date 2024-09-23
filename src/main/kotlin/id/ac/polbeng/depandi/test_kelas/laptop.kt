package id.ac.polbeng.depandi.test_kelas

// Parent class
open class Computer(val name: String,
                    val brand: String) {
}


class laptop (name: String,
brand: String,
val batteryLife: Double) : Computer(name, brand) {
    fun info() {
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}