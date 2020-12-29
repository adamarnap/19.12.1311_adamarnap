package inheritance

open class Karyawan : Orang() {
    var nip: String= ""
    var gaji: Int= 0

    fun bekerja(){
        println("saya bekerja dengan gaji $gaji")
    }
}