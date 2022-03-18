fun main() {
    val numbers = listOf("one","two","three","four")
    println("Number of elements: ${numbers.size}")
    println("Third elements: ${numbers.get(2)}")
    println("Fourth elements: ${numbers[3]}")
    println("Index of elements \"two\" ${numbers.indexOf("two")}")

    // Elemen daftar (termasuk nol) dapat diduplikasi
    val bob = Person("Bob", 31)
    val people = listOf<Person>(Person("Adam", 20), bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)
}
class Person(var name: String, var age: Int) {}