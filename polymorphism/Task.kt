package polymorphism

fun main(){
    val afrig = Dosen()
    afrig.nama = "Afrig Aminudin"
    afrig.alamat = "Condong Catur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val andika = Mahasiswa()
    andika.nama = "Andika Maharani"
    andika.alamat = "Bantul"
    andika.perkenalan()
    andika.prodi= "Sistem Informasi"
    andika.belajar()

    val budi = Satpam()
    budi.nama = "Budi"
    budi.alamat= "Wonosari"
    budi.perkenalan()
    budi.gaji = 500000
    budi.bekerja()
    budi.pos = "barat"
    budi.menjaga()
}