package kz.almat.myapplicationstartactivityforresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnName.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent = Intent(this, NameActivity::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(data == null) return
        var name: String = data.getStringExtra("name")
        tvName.text = "Your name is $name"
    }
}
