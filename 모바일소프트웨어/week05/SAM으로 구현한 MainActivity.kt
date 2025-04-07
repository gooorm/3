package com.example.listener_test

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listener_test.databinding.ActivityMainBinding

import java.text.Format

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var root = binding.root
        //enableEdgeToEdge()
        setContentView(root)

        binding.button.setOnClickListener { 
            binding.textView.text = binding.editText.text
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    inner class onClickButton(var context: Context) : View.OnClickListener{
        override fun onClick(v: View?) {
            binding.textView.text = binding.editText.text
        }
    }
}
