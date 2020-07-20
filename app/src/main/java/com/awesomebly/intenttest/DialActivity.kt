package com.awesomebly.intenttest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dial.*

class DialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial)

        return_btn.setOnClickListener(View.OnClickListener {
            var intent : Intent = Intent()
            intent.putExtra("name", "mike")
            setResult(Activity.RESULT_OK, intent)
            finish()


        })
    }
}
