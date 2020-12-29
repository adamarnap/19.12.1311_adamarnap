package polymorphism

open class SparePart() {
    var namabarang: String= ""
    var kode: String = ""
    var harga: Int= 0

   open fun barang(){
        println("Nama Barang = $namabarang, Kode Barang = $kode, Harga Barang = $harga")
    }
}