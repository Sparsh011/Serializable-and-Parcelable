package com.example.contextdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_go)
        val et = findViewById<EditText>(R.id.et_enter)

        btn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)

//            Serializable -
            val text = et.text.toString()
            val obj = DemoSerializable(text, 5)
            intent.putExtra(SERIALIZABLE_KEY, obj)

//            Parcelable -
            val obj2 = DemoParcelable(text, 9)
            intent.putExtra(PARCELABLE_KEY, obj2)
            startActivity(intent)
        }
    }

    companion object{
        const val SERIALIZABLE_KEY = "SerializableObject"
        const val PARCELABLE_KEY = "ParcelableObject"
    }
}