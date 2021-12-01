package com.example.simplejunitexample

object RegistrationUtil {

    private val existingUsers = listOf("Temur", "Khatiashvili")

    fun validRegistrationInput(
        userName : String,
        password : String,
        confirmPassword : String
    ) : Boolean {
        // write conditions along with their return statement
        // if username / password / confirm password are empty return false
        if (userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            return false
        }
        // if username exists in the existingUser list return false
        if (userName in existingUsers){
            return false
        }
        // if password does not matches confirm password return false
        if (password != confirmPassword){
            return false
        }
        // if digit count of the password is less than 2 return false
        if (password.count { it.isDigit() } < 2){
            return false
        }
        return true
    }



}