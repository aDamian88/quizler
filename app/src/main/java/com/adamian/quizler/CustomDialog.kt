package com.adamian.quizler

import android.R.style
import android.app.Dialog
import android.content.Context
import android.util.Log
import android.view.Window
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup


class CustomDialog(context: Context) : Dialog(context) {

    companion object {

        private const val TAG = "CustomDialog"

        fun twoChoices(context: Context, choiceOne: String, choiceTwo: String) {
            val dialog = Dialog(context, style.Theme_Black_NoTitleBar_Fullscreen)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(true)
            dialog.setContentView(R.layout.quizler_dialog_two_choices)
            dialog.show()

            val rgChoices = dialog.findViewById<RadioGroup>(R.id.rg_choices)

            val rbOne = dialog.findViewById<RadioButton>(R.id.rb_choice_one)
            rbOne.setText(choiceOne)

            val rbTwo = dialog.findViewById<RadioButton>(R.id.rb_choice_two)
            rbTwo.setText(choiceTwo)

            val btClose = dialog.findViewById<Button>(R.id.bt_close)
            btClose.setOnClickListener {
                val radio: RadioButton = dialog.findViewById(rgChoices.checkedRadioButtonId)
                Log.d(TAG, "twoChoices: ${radio.text}")

            }
        }


    }
}