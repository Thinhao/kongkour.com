package com.chhurngsapplication.app.modules.registeren.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.registeren.`data`.model.RegisterEnModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class RegisterEnVM : ViewModel(), KoinComponent {
  val registerEnModel: MutableLiveData<RegisterEnModel> = MutableLiveData(RegisterEnModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
