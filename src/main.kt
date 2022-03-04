fun main() {
    school()
    var stmt = statement("Ashly", 19)
    println(stmt)
    var name = string("AkiraChix")
    println(name)
    name()
}
// Write a function that prints out a string composed of
//the first, third and fourth characters of the string
fun school(){
    var name = "AkiraChix"
    println(name[1].toString()+name[3]+name[4])
}
//Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.
fun statement(name:String, age:Int):String {
    var sentence = "Hi, my name is $name and I am $age years old"
    return sentence
}
//Write a function that takes in a String and returns its length
fun string(name:String):Int{
    var size = name.length
    return size
}
//Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is” (
fun name(){
    var name = "Ashly Ochwada"
    if (name=="Ashly Ochwada"){
        println("That's me")
    }
    else
        println("I don't know who that is")
}