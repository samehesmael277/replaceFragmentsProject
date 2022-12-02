package com.sameh.replacefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.sameh.replacefragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val aFragment = AFragment()
        val bFragment = BFragment()
        val cFragment = CFragment()

        setFragment(aFragment)

        binding.aBtn.setOnClickListener {
            setFragment(aFragment)
        }

        binding.bBtn.setOnClickListener {
            setFragment(bFragment)
        }

        binding.cBtn.setOnClickListener {
            setFragment(cFragment)
        }

    }

    private fun setFragment(Fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.my_frame, Fragment)
        transaction.commit()
    }
}