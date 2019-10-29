package com.example.responsi_5170411366

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.responsi_5170411366.R
import com.example.responsi_5170411366.dasboard
import kotlinx.android.synthetic.main.activity_formbiodata.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.Password1
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            val intent = Intent(this, dasboard::class.java)
            startActivity(intent)
            finish()
        }
        btn.setOnClickListener {
            val Username1 = Username.text.toString()
            val Password1 = Password.text.toString()
            if (Username1.isEmpty()|| Password1.isEmpty()){
                Toast.makeText(this, " Please Insert Username and password",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (Username1=="Rofi22"|| Password1=="Rofi23"){
                val progressDialog= ProgressDialog(this,R.style.Theme_AppCompat_Light_Dialog)
                progressDialog.setMessage("authenticating")
                progressDialog.show()
                val intent = Intent(this,dasboard::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
