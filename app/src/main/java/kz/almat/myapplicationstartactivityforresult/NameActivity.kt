package kz.almat.myapplicationstartactivityforresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_name.*

class NameActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        btnOK.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent = Intent()
        intent.putExtra("name", etName.text.toString())
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
