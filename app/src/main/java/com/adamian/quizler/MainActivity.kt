package com.adamian.quizler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: ${"inside open"}")
        CustomDialog.fourChoices(this,"Πόσες υπολογιστικές μηχανές περιέχει κατά μέσο όρο ένα σύγχρονο μεσοαστικό σπίτι;","Μία","2 με 5","Περίπου 10","Πάνω από 60")

    }
}