package com.chhurngsapplication.app.modules.registerdoneone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.registerdoneone.`data`.model.RegisterDoneOneModel
import org.koin.core.KoinComponent

class RegisterDoneOneVM : ViewModel(), KoinComponent {
  val registerDoneOneModel: MutableLiveData<RegisterDoneOneModel> =
      MutableLiveData(RegisterDoneOneModel())

  var navArguments: Bundle? = null
}
