package ru.iu3.reddit

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Button
import androidx.activity.viewModels
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import ru.iu3.reddit.model.LoginViewModel


class LoginPage: Fragment(R.layout.fragment_authorization){
    private var emailInput: TextInputEditText?= null
    private var passwordInput: TextInputEditText?= null



    private val viewModel: LoginViewModel by viewModels()



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val loginButton = view?.findViewById<Button>(R.id.buttonLogin)

        loginButton?.setEnabled(false)



        emailInput = view?.findViewById<TextInputEditText>(R.id.inputLogin);
        passwordInput = view?.findViewById<TextInputEditText>(R.id.inputPassword)


        var isValidMail: Boolean
        var isValidPassword: Boolean

        fun checkValid(){
            isValidMail = Patterns.EMAIL_ADDRESS.matcher(emailInput?.text.toString()).matches()
            isValidPassword = passwordInput?.text.toString().length >= 8

            if (isValidMail && isValidPassword) {
                loginButton?.setEnabled(true)
            }
            else
                loginButton?.setEnabled(false) // на случай, если сотрут уже написанное
        }



        emailInput?.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                checkValid()
            }

        })


        passwordInput?.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                checkValid()
            }

        })


        viewModel.state.observe(viewLifecycleOwner, { state ->

                emailInput?.setText(state.inputEmail)
                passwordInput?.setText(state.inputPassword)

        })



        loginButton?.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_mainPage)
        }
    }





    override fun onDestroyView() {
        super.onDestroyView()
        passwordInput = null
        emailInput = null
    }

    override fun onStop() {
        super.onStop()
        viewModel.updateInformation(emailInput?.text.toString(), passwordInput?.text.toString())
        //делал текстовые поля без id, искал их через тег. Сохраняет состояние корректно.
    }



}