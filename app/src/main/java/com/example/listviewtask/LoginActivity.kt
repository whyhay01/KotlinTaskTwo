package com.example.listviewtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var email = findViewById<EditText>(R.id.et_name)
        var password = findViewById<EditText>(R.id.et_password)
        var button = findViewById<Button>(R.id.bn_login)

//        val getEmail: String = email.text.toString()
//        val getPassword: String = password.text.toString()

        button.setOnClickListener {

            if (email.text.toString().isNullOrEmpty()|| password.text.toString().isNullOrEmpty()) {

                Toast.makeText(this, "Email or Password is not set", Toast.LENGTH_LONG).show()

            }

            if (email.text.toString() == "hyaaquub@gmail.com" && password.text.toString() == "afolabi44"){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{

                Toast.makeText(this, "Email or Password set is incorrect", Toast.LENGTH_SHORT).show()
            }


        }
    }
}