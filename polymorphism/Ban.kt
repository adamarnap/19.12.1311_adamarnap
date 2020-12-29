package polymorphism

class Ban : SparePart() {
    override fun barang(){
        println(" $namabarang  dengan kode $kode telah dipesan oleh konsumen dan di tawar sebesar Rp $harga ")
    }
}