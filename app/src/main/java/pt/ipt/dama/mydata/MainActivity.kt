package pt.ipt.dama.mydata

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find the button and add some action
        findViewById<Button>(R.id.nickname_button).setOnClickListener{
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        //write here what the button will do...

        //find the elements that i want to change
        //we are making 'pointers' to that elements
        val auxNicknameTextBox = findViewById<EditText>(R.id.nicknameEditText)
        val auxNicknameTextView = findViewById<TextView>(R.id.nickname_textView)
        val auxNicknameButton = findViewById<Button>(R.id.nickname_button)
        val auxUsersCV_textView = findViewById<TextView>(R.id.usersCV_textView)
        //assign the text from TextBox to TexView
        auxNicknameTextView.text = auxNicknameTextBox.text

        // show the TextViews and hide the button and
        // other elements that i don't need anymore
        auxNicknameTextView.visibility = View.VISIBLE
        auxNicknameTextBox.visibility = View.GONE
        auxNicknameButton.visibility = View.GONE
        auxUsersCV_textView.visibility = View.VISIBLE

        //hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}