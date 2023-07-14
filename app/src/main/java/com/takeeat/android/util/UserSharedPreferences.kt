package com.takeeat.android.util

import android.content.Context
import android.content.SharedPreferences

object UserSharedPreferences {
    private const val PREFERENCE_NAME : String = "account"
    private lateinit var sharedPreferences: SharedPreferences

    fun initialize(context: Context) {
        sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
    }

    fun setFCMToken(input: String) {
        val editor : SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("token", input)
        editor.apply()
    }

    fun getFCMToken(): String {
        return sharedPreferences.getString("token", "").toString()
    }
}