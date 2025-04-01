package dduw.com.mobile.retry

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dduw.com.mobile.retry.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)

        enableEdgeToEdge()
         //(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun onClickUp(view: View){
        binding.myCustomView.m_y -= 20
        binding.myCustomView.invalidate()
    }
    fun onClickDown(view: View){
        binding.myCustomView.m_y += 20
        binding.myCustomView.invalidate()
    }
    fun onClickLeft(view: View){
        binding.myCustomView.m_x -= 20
        binding.myCustomView.invalidate()
    }
    fun onClickRight(view: View){
        binding.myCustomView.m_x += 20
        binding.myCustomView.invalidate()
    }
    fun onClickYellow(view: View){
        binding.myCustomView.color_name = Color.YELLOW
        binding.myCustomView.invalidate()
    }
    fun onClickGreen(view: View){
        binding.myCustomView.color_name = Color.GREEN
        binding.myCustomView.invalidate()
    }

}
