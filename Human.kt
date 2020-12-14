class Human(val name: String) {
    //property atau atribut atau field
    var email : String = ""
    var address : String = ""

    //Method
    fun talk (){
        println("Alamat email adalah $email")
    }

    fun verify(email : String): Boolean{
        return email == this.email
    }

    fun introduce(){
        println("perkenalkan saya adalah $name")
    }
}