fun main() {
    //variabel
    val fristName1 = "Andi"
    val lastName1 = "Budiman"
    val age1 = 34

    println(fristName1)
    println(lastName1)
    println(age1)

    val fristName2 = "Rudi"
    val lastName2 = "Setiawan"
    val age2 = 25

    println(fristName2)
    println(lastName2)
    println(age2)

    //dengan Aray

    val fristName = arrayListOf<String>()
    val lastName = arrayListOf<String>()
    val age = arrayListOf<Int>()

    fristName.add("Andi")
    lastName.add("Budiman")
    age.add(34)

    fristName.add("Rudi")
    lastName.add("Setiawan")
    age.add(25)

    for (first in fristName) {
        println(first)
    }
    for (last in lastName) {
        println(last)
    }
    for (a in age) {
        println(a)
    }

    // degnan array v2
    val andiArray = arrayListOf<Any>()
    andiArray.add("Andi")
    andiArray.add("Budiman")
    andiArray.add(34)

    for (andi in andiArray)
    {
        println(andi)
    }

    //dengan Array v3
    val mhsArray = arrayListOf<ArrayList<Any>>()
        mhsArray.add(andiArray)
        mhsArray.add(arrayListOf("Rudi","Setiawan", 25))

    for (item in mhsArray){
        for (i in item){
            println(i)
        }
    }

    // Menggunakan data class
    val andi = User ("Andi", "Budiman", 34)
    val rudi = User (age = 25, lastName = "Setiawan", firstName = "Rudi")
    val dedi = User ()
    dedi.age = 35
    dedi.firstName = "Dedi"

    val andi2 = andi.copy(age = 40)
    println(andi)
    println(rudi)
    println(dedi)
    println(andi.lastName)
    println(andi2)

    // mnggunakan data class array
    val mhsAmikom = arrayListOf<User>()
    mhsAmikom.add(andi)
    mhsAmikom.add(rudi)
    mhsAmikom.add(dedi)

    mhsAmikom.add(User("Ferdi", "Setiawan", 45))

    for (mhs in mhsAmikom){
        println(mhs)
    }
}