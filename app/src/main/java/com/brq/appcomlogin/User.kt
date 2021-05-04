package com.brq.appcomlogin

class User(
    var nome: String,
    var email: String,
    var senha: String,
    var idade: Int
) {
    fun validarEmail(valor: String): Boolean{
        return  email.contentEquals(valor)
    }

    fun validarSenha(valor: String): Boolean {
        return  senha.contentEquals(valor)
    }

    fun loginValidator(password: String, email: String): Boolean{
        return email.contentEquals(email) && senha.contentEquals(password)
    }
}