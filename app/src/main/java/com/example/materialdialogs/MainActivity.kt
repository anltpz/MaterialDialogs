package com.example.materialdialogs

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.shreyaspatil.MaterialDialog.BottomSheetMaterialDialog
import dev.shreyaspatil.MaterialDialog.MaterialDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 =findViewById<Button>(R.id.button)
        val button2 =findViewById<Button>(R.id.button2)
        val button3 =findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            val mDialog = MaterialDialog.Builder(this)
                .setTitle("Delete?")
                .setAnimation(R.raw.roll)
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton(
                    "Delete", R.drawable.ic_outline
                ) { dialogInterface, which ->
                    // Delete Operation
                }
                .setNegativeButton(
                    "Cancel", R.drawable.ic_outline
                ) { dialogInterface, which -> dialogInterface.dismiss() }
                .build()

            // Show Dialog

            // Show Dialog
            mDialog.show()

        }

        button2.setOnClickListener {
            val mBottomSheetDialog = BottomSheetMaterialDialog.Builder(this)
                .setTitle("Delete?")
                .setAnimation(R.raw.delete)
                .setMessage("Are you sure want to delete this file?")
                .setCancelable(false)
                .setPositiveButton(
                    "Delete", R.drawable.ic_outline
                ) { dialogInterface, which ->
                    Toast.makeText(applicationContext, "Deleted!", Toast.LENGTH_SHORT).show()
                    dialogInterface.dismiss()
                }
                .setNegativeButton(
                    "Cancel", R.drawable.ic_outline
                ) { dialogInterface, which ->
                    Toast.makeText(applicationContext, "Cancelled!", Toast.LENGTH_SHORT).show()
                    dialogInterface.dismiss()
                }
                .build()

            // Show Dialog

            // Show Dialog
            mBottomSheetDialog.show()
        }

        button3.setOnClickListener {

        }

    }
}