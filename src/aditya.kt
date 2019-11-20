open class Car(var modle: Int, val name: String){
    fun carinfo() {
        println(" (A) car in the showroom $name $modle")

    }

}

class Superbikes(modle: Int, name: String): Car(modle, name) {
    fun bikeinfo() {
        println(" (B) bikes in the showroom $name $modle")
    }


}

class Showroom(modle: Int, name: String): Car(modle, name) {
    fun showroominfo() {
        println("car and superbikes in showroom ")
    }

}
fun main(args: Array<String>) {
    val a1 = Car(320, "eirtica")
    a1.carinfo()
    val b1 = Superbikes(1250, "ducati")
    b1.bikeinfo()
    val b2 = Car(320, "eirtica")
    b2.carinfo()
    val a2 = Superbikes(1250, "ducati")
    a2.bikeinfo()

}