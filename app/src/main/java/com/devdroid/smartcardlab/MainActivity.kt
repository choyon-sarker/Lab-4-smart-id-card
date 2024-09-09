package com.devdroid.smartcardlab

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val email:LinearLayout=findViewById(R.id.email_id)
        val phone:LinearLayout=findViewById(R.id.phone_id)
        val facebook:ImageView=findViewById(R.id.fb_id)
        val whatsapp:ImageView=findViewById(R.id.whatsapp_id)
        val github:ImageView=findViewById(R.id.github_id)
        val instagram:ImageView=findViewById(R.id.insta_id)
        val qr_code:ImageView=findViewById(R.id.qr_id)

        email.setOnClickListener {

            val intent_email=Intent(Intent.ACTION_SENDTO)
            intent_email.data= Uri.parse("mailto:choyon.stu392@gmail.com")
            startActivity(intent_email)
        }

        phone.setOnClickListener {
            val intent_phone=Intent(Intent.ACTION_DIAL)
            intent_phone.data=Uri.parse("tel:01733173521")
            startActivity(intent_phone)
        }

        facebook.setOnClickListener {
            val intent_facebook=Intent(Intent.ACTION_VIEW)
            intent_facebook.data=Uri.parse("https://www.facebook.com/profile.php?id=100008496645635")
            startActivity(intent_facebook)
        }

        github.setOnClickListener {
            val intent_github=Intent(Intent.ACTION_VIEW)
            intent_github.data=Uri.parse("https://github.com/choyon-sarker")
            startActivity(intent_github)
        }
        qr_code.setOnClickListener {
            val intent_qr=Intent(Intent.ACTION_VIEW)
            intent_qr.data=Uri.parse("https://www.apple.com")
            startActivity(intent_qr)
        }
        whatsapp.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(
                        "https://api.whatsapp.com/send?phone=+8801733173521&text=How are you Choyon "
                    )
                )
            )
        }
        instagram.setOnClickListener {
            val intent_instagram=Intent(Intent.ACTION_VIEW)
            intent_instagram.data=Uri.parse("https://www.instagram.com/ch_oyo_n/")
            startActivity(intent_instagram)
        }

    }

}