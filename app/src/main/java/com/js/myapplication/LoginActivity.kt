package com.js.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.js.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    val idVal = "angella"
    val pwVal = "loveA"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val id = binding.idEdt.text.toString()
            val pw = binding.pwEdt.text.toString()
            if(id.isNotBlank() && pw.isNotBlank()) {
                if(id.equals(idVal) && pw.equals(pwVal)) {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("id", id)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "ID와 PW를 확인해 주세요", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}