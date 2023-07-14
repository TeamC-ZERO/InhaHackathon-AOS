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
import com.takeeat.android.databinding.ActivityInsertBinding
import com.takeeat.android.databinding.ActivityMainBinding

class InsertActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityInsertBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityInsertBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewBinding.toolbarInsert.toolbar.title = ""
        setSupportActionBar(viewBinding.toolbarInsert.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.left)
        }

        viewBinding.btnSearch.setOnClickListener {

        }

        viewBinding.btnCancel.setOnClickListener {

        }

        viewBinding.btnInsert.setOnClickListener {

        }

        viewBinding.btnScan.setOnClickListener {

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