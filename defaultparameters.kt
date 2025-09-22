fun main(){
    sendMessage("Alexa")
    sendMessage(message="Hello") //to send value to message without sending to name
    sendMessage(message="Hello", name = "Alexa") 
}
fun sendMessage(name: String= "User", message: String= sendText()){ //calling a function within a function
    println("Name= $name and message = $message")
}
fun sendText(): String{
    return "Some text!"
}