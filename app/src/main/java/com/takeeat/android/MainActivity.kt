package com.takeeat.android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.takeeat.android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.toolbarMain.toolbar.title = ""
        setSupportActionBar(viewBinding.toolbarMain.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(false)
            setHomeAsUpIndicator(R.drawable.left)
        }

        viewBinding.btnReceipt.setOnClickListener {
            val intent = Intent(this, ReceiptActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home ->{
                viewBinding.btnReceipt.background = getDrawable(R.drawable.button_1)
                viewBinding.btnReceipt.text = "N개로 레시피 확인하기"
                supportActionBar?.apply {
                    setDisplayHomeAsUpEnabled(false)
                    setHomeAsUpIndicator(R.drawable.left)
                }
            }

            R.id.insert->{
                val intent = Intent(this, InsertActivity::class.java)
                startActivity(intent)
            }

            R.id.delete->{
                viewBinding.btnReceipt.background = getDrawable(R.drawable.button_2)
                viewBinding.btnReceipt.text = "N개 냉장고에서 삭제하기"
                supportActionBar?.apply {
                    setDisplayHomeAsUpEnabled(true)
                    setHomeAsUpIndicator(R.drawable.left)
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}