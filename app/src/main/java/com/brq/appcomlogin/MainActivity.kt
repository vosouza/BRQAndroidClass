package com.brq.appcomlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var usuario: User
    private lateinit var edtSenha: EditText
    private lateinit var edtEmail: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtSenha = findViewById<EditText>(R.id.edtSenha)
        edtEmail = findViewById<EditText>(R.id.edtEmail)

        usuario = User("Arthur","cpudvini@gmail.com","123456", 32)
    }

    fun outraTela(view: View){

        if(usuario.validarEmail(edtEmail.text.toString()) && usuario.validarSenha(edtSenha.text.toString())) {
            val intent = Intent(this, CarsInformation::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this,"SENHA INVALIDA",Toast.LENGTH_SHORT).show()
        }

    }

    override fun onStart() {
        super.onStart()
        println("----------------- onStart")
    }

    override fun onRestart() {
        super.onRestart()
        println("----------------- onRestart")
    }

    override fun onResume() {
        super.onResume()
        println("----------------- onResume")
    }

    override fun onPause() {
        super.onPause()
        println("----------------- onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("----------------- onDestroy")
    }
}