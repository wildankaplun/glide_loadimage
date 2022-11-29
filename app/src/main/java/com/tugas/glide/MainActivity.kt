package com.tugas.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Panggil imageview, edit text dan buttonnya
        val imageView: ImageView = findViewById(R.id.gambar)
        val buttonLoadUlang: Button = findViewById(R.id.btnGanti)

        var defaultUrlImg = "https://www.linkpicture.com/q/pantai-pangandaran-tempat-untuk-liburan-dan-belajar.jpg";

        Glide.with(this)
            .load(defaultUrlImg)
            .into(imageView);

        buttonLoadUlang.setOnClickListener() {
            loadUlang(imageView)
        }
    }

    fun loadUlang(view: View) {
        // Panggil imageview, edit text dan buttonnya
        val imageView: ImageView = findViewById(R.id.gambar);
        val inputURL: EditText = findViewById(R.id.txtUrlImage)

        //baca url dari edittextnya
        var urlImg = inputURL.text.toString().trim()

        Glide.with(this)
            .load(urlImg)
            .into(imageView);
    }
}