package polymorphism

class Knalpot : SparePart() {
    override fun barang(){
        println(" $namabarang  dengan kode $kode telah dipesan oleh konsumen dan di beli dengan $harga ")
    }
}