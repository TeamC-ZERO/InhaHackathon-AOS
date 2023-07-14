package com.takeeat.android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import com.takeeat.android.databinding.ActivityReceiptBinding
import com.takeeat.android.databinding.ActivityReceiptDetailBinding

class ReceiptActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityReceiptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityReceiptBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.toolbarReceipt.toolbar.title = ""
        setSupportActionBar(viewBinding.toolbarReceipt.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.left)
        }

        //임시
        viewBinding.toolbarReceipt.toolbar.setOnClickListener {
            val intent = Intent(this, ReceiptDetailActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home ->{
                Toast.makeText(this, "뒤로가기", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}