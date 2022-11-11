package com.example.contextdemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.contextdemo.MainActivity.Companion.PARCELABLE_KEY
import com.example.contextdemo.MainActivity.Companion.SERIALIZABLE_KEY

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        Serializable -
        val serializableDataFromIntent = intent.getSerializableExtra(SERIALIZABLE_KEY) as DemoSerializable
        val tvSerializableData = findViewById<TextView>(R.id.serializable_text_view)
        tvSerializableData.text = "Serializable text - " + serializableDataFromIntent.text + "\n" + "Serializable id - " + serializableDataFromIntent.id.toString()


//        Parcelable -
        val parcelableDataFromIntent = intent.getParcelableExtra<DemoParcelable>(PARCELABLE_KEY)
        val tvParcelableData = findViewById<TextView>(R.id.parcelable_text_view)
        tvParcelableData.text = "Parcelable Text - " + parcelableDataFromIntent?.text + "\n" + "Parcelable id - " + parcelableDataFromIntent?.id

    }
}