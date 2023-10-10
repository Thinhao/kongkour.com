package com.chhurngsapplication.app.modules.registerdone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.registerdone.`data`.model.RegisterDoneModel
import org.koin.core.KoinComponent

class RegisterDoneVM : ViewModel(), KoinComponent {
  val registerDoneModel: MutableLiveData<RegisterDoneModel> = MutableLiveData(RegisterDoneModel())

  var navArguments: Bundle? = null
}
