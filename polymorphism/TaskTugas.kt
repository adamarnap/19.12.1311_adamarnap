package polymorphism

fun main(){
    val sekher = Piston()
    sekher.namabarang = "Piston Supra x"
    sekher.kode = "SPR125"
    sekher.harga = 200000
    sekher.barang()
    sekher.fungsi = "Menggerakkan Mesin"
    sekher.guna()

    val roda = Ban()
    roda.namabarang = "IRC 270/150"
    roda.kode = "270IRC"
    roda.harga = 150000
    roda.barang()

    val nisn = Kampas()
    nisn.namabarang = "Kampas cakram depan"
    nisn.kode = "H89J"
    nisn.harga = 30000
    nisn.barang()

    val karbu = Karburator()
    karbu.namabarang = "Original Keihin Supra x 125"
    karbu.kode = "KHN125"
    karbu.harga = 350000
    karbu.barang()

    val silinder = Knalpot()
    silinder.namabarang = "R9 Original 2 Stroke"
    silinder.kode = "R9 ninja RR"
    silinder.harga = 1500000
    silinder.barang()

    val oil = Oli()
    oil.namabarang = "Enduro Racing"
    oil.kode = "ENDRRCG"
    oil.harga = 55000
    oil.barang()
    oil.fungsi ="Untuk melumasi komponen komponen mesin"
    oil.guna()

    val sss = Rantai()
    sss.namabarang = "Triple S"
    sss.kode = "ORGSSS"
    sss.harga = 150000
    sss.barang()

    val mirror = Spion()
    mirror.namabarang = "TDR Mirror"
    mirror.kode = "TDR 354"
    mirror.harga = 100000
    mirror.barang()

    val sok = Suspensi()
    sok.namabarang = "YSS Merah"
    sok.kode = "Red YSS 876"
    sok.harga = 300000
    sok.barang()

    val pelek = Piston()
    pelek.namabarang = "Comet Ring 17"
    pelek.kode = "CMT17"
    pelek.harga = 150000
    pelek.barang()

    
}