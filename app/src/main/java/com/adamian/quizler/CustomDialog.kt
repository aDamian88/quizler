package com.adamian.quizler

import android.R.style
import android.app.Dialog
import android.content.Context
import android.util.Log
import android.view.Window
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView


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
            rbOne.text = choiceOne

            val rbTwo = dialog.findViewById<RadioButton>(R.id.rb_choice_two)
            rbTwo.text = choiceTwo

            val btClose = dialog.findViewById<Button>(R.id.bt_close)
            btClose.setOnClickListener {
                val radio: RadioButton = dialog.findViewById(rgChoices.checkedRadioButtonId)
                Log.d(TAG, "twoChoices: ${radio.text}")

            }
        }

        fun threeChoices(context: Context, choiceOne: String, choiceTwo: String, choiceThree: String) {
            val dialog = Dialog(context, style.Theme_Black_NoTitleBar_Fullscreen)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(true)
            dialog.setContentView(R.layout.quizler_dialog_three_choices)
            dialog.show()

            val rgChoices = dialog.findViewById<RadioGroup>(R.id.rg_choices)

            val rbOne = dialog.findViewById<RadioButton>(R.id.rb_choice_one)
            rbOne.text = choiceOne

            val rbTwo = dialog.findViewById<RadioButton>(R.id.rb_choice_two)
            rbTwo.text = choiceTwo

            val rbThree = dialog.findViewById<RadioButton>(R.id.rb_choice_three)
            rbThree.text = choiceThree

            val btClose = dialog.findViewById<Button>(R.id.bt_close)
            btClose.setOnClickListener {
                val radio: RadioButton = dialog.findViewById(rgChoices.checkedRadioButtonId)
                Log.d(TAG, "twoChoices: ${radio.text}")

            }
        }

        fun fourChoices(context: Context, question: String, choiceOne: String, choiceTwo: String, choiceThree: String, choiceFour: String) {
            val dialog = Dialog(context, style.Theme_Black_NoTitleBar_Fullscreen)
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialog.setCancelable(true)
            dialog.setContentView(R.layout.quizler_dialog_four_choices)
            dialog.show()

            val questionText = dialog.findViewById<TextView>(R.id.tv_dialog_title)
            questionText.text = question

            val rgChoices = dialog.findViewById<RadioGroup>(R.id.rg_choices)

            val rbOne = dialog.findViewById<RadioButton>(R.id.rb_choice_one)
            rbOne.text = choiceOne

            val rbTwo = dialog.findViewById<RadioButton>(R.id.rb_choice_two)
            rbTwo.text = choiceTwo

            val rbThree = dialog.findViewById<RadioButton>(R.id.rb_choice_three)
            rbThree.text = choiceThree

            val rbFour = dialog.findViewById<RadioButton>(R.id.rb_choice_four)
            rbFour.text = choiceFour

            val btClose = dialog.findViewById<Button>(R.id.bt_close)
            btClose.setOnClickListener {
                val radio: RadioButton = dialog.findViewById(rgChoices.checkedRadioButtonId)
                Log.d(TAG, "twoChoices: ${radio.text}")

            }
        }


    }
}
