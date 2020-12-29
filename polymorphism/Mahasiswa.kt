package polymorphism

class Mahasiswa : Orang() {

    var nim: String= ""
    var prodi: String= ""


    fun belajar(){
        println("Saya belajar di prodi $prodi")
    }

    override fun perkenalan(){
        println("Kenalain dong aku $nama, alamat dari $alamat" )
    }
}