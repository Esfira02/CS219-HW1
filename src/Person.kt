class Person(name: String, surname: String, age: Int) {
    val name = name
    val surname = surname
    var age = age

    fun lifeStage(age: Int): String{
        if (!(0 >= age || age >= 13)){
            return "You are a child"
        } else if (13 > age || age <= 21){
            return "You are a teenager"
        } else if (age > 21){
            return "You are an adult"
        } else{
            return "Invalid input"
        }
    }
}