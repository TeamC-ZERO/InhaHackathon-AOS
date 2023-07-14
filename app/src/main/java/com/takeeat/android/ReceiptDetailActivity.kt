package com.takeeat.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import com.takeeat.android.databinding.ActivityReceiptBinding
import com.takeeat.android.databinding.ActivityReceiptDetailBinding

class ReceiptDetailActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityReceiptDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityReceiptDetailBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.toolbarReceiptDetail.toolbar.title = ""
        setSupportActionBar(viewBinding.toolbarReceiptDetail.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.left)
        }

        viewBinding.btnDone.setOnClickListener {

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