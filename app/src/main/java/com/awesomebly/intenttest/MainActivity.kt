package com.awesomebly.intenttest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public final val REQUEST_CODE_MENU = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu_button.setOnClickListener(View.OnClickListener {
            var intent : Intent = Intent(this, DialActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_MENU)
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_CODE_MENU){
            Toast.makeText(this, "onActivity 메서드 호출됨, 요청코드 : $requestCode, 결과 코드 : $resultCode", Toast.LENGTH_SHORT).show()
            if (resultCode == Activity.RESULT_OK){
                var name : String? = data?.getStringExtra("name")
                Toast.makeText(this, "응답으로 전달된 name : $name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
