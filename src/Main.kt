//problem7
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    //Problem 1
    val fruits = arrayOf<String>("apple", "banana", "orange")

    for(fruit in fruits){
        println(fruit)
    }

    var subjects = mutableListOf<String>("Calculus", "Linear algebra", "Discrete math")
    subjects.add("Computer Vision")
    for (subject in subjects){
        println(subject)
    }

    //Problem 2
    var greeting: String = "My name is Esfira Babajanyan"
    var name: String = greeting.substring(11,18)
    println(name)
    name = name.toUpperCase()
    println(name)
    var surname = greeting.substring(18,28)
    println(surname)
    var fullName: String =  name + surname
    println(fullName)

    //Problem3
    var films: Map<String, Int> = mutableMapOf(
        "The Godfather" to 1972,
        "Interstellar" to 2014,
        "Life is Beautiful" to 1997
    )

    for ((film, year) in films){
        println("Film: $film, Year: $year")
    }

    //Problem 4
    println(signIndicator(-1))
    println(signIndicator(0))
    println(signIndicator(11))

    //Problem 5
    println(personalGreeting("Esfira", 21))

    //Problem 6
    println(division(9.0,3.0))
    println(division(7.0,0.0))

    //Problem 7
    val currentDateTime = LocalDateTime.now()
    val currentFormatted = currentDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
    println(currentFormatted)

    //Problem 8
    val person1: Person = Person("Esfira", "Babajanyan", 21)
    println(person1)
    println(person1.name)
    println(person1.surname)
    println(person1.age)

    //Problem 9
    println(person1.lifeStage(21))
    val person2: Person = Person("John", "Smith", 72)
    println(person2.age)
    println(person2.lifeStage(person2.age))

    //Problem 10
    var integers = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val evens = integers.filter { number: Int -> number % 2 == 0 }
    println("Even Numbers: $evens")


}

//Problem 4
fun signIndicator(x:Int):String{
    if (x > 0){
        return "The input $x is positive"
    } else if (x<0){
        return "The input $x is negative"
    } else {
        return "The input $x is equal to zero"
    }
}

//Problem 5
fun personalGreeting(name: String, age:Int): String {
    return "Hi $name, I see you are $age years old!"
}

//Problem 6
fun division(nom: Double, denom: Double): Double? {
    if (denom != 0.0){
        return nom/denom
    } else{
        println( "Cant divide by zero")
        return null
    }
}