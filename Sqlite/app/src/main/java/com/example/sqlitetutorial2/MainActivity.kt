package com.example.sqlitetutorial2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var addName: Button? = null
    private var printName: Button? = null
    private var deleteAll: Button? = null
    private var enterName: EditText? = null
    private var enterAge: EditText? = null
    private var Name: TextView? = null
    private var Age: TextView? = null

    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // below code is to add on click
        // listener to our add name button
        addName = findViewById(R.id.addName)
        enterName = findViewById(R.id.enterName)
        enterAge = findViewById(R.id.enterAge)
        Name = findViewById(R.id.Name)
        Age = findViewById(R.id.Age)

        addName?.setOnClickListener{
            // below we have created
            // a new DBHelper class,
            // and passed context to it
            val db = DBHelper(this, null)

            // creating variables for values
            // in name and age edit texts
            val name = enterName?.text.toString()
            val age = enterAge?.text.toString()

            // calling method to add
            // name to our database
            db.addName(name, age)

            // Toast to message on the screen
            Toast.makeText(this, name + " added to database", Toast.LENGTH_LONG).show()

            // at last, clearing edit texts
            enterName?.text?.clear()
            enterAge?.text?.clear()
        }

        // below code is to add on click
        // listener to our print name button
        printName = findViewById(R.id.printName)
        printName?.setOnClickListener{

            // creating a DBHelper class
            // and passing context to it
            val db = DBHelper(this, null)

            // below is the variable for cursor
            // we have called method to get
            // all names from our database
            // and add to name text view
            val cursor = db.getName()

            // moving the cursor to first position and
            // appending value in the text view
            cursor!!.moveToFirst()
            Name?.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
            Age?.append(cursor.getString(cursor.getColumnIndex(DBHelper.AGE_COL)) + "\n")

            // moving our cursor to next
            // position and appending values
            while(cursor.moveToNext()){
                Name?.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
                Age?.append(cursor.getString(cursor.getColumnIndex(DBHelper.AGE_COL)) + "\n")
            }

            // at last we close our cursor
            cursor.close()
        }

        deleteAll = findViewById(R.id.delete)
        deleteAll?.setOnClickListener{
            // below we have created
            // a new DBHelper class,
            // and passed context to it
            val db = DBHelper(this, null)

            // calling method to add
            // name to our database
            db.deleteAll()

            // Toast to message on the screen
            Toast.makeText(this, "all data has been deleted", Toast.LENGTH_LONG).show()
            Name?.text = null
            Age?.text = null
        }

    }
}
