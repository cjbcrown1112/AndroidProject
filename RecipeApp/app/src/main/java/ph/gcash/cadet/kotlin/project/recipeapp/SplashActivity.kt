package ph.gcash.cadet.kotlin.project.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        btnGetStarted.setOnClickListener{
            var intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
        }
        }
}