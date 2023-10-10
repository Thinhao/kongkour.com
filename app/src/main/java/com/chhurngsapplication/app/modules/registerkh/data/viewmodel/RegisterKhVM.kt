package com.chhurngsapplication.app.modules.registerkh.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.registerkh.`data`.model.RegisterKhModel
import org.koin.core.KoinComponent

class RegisterKhVM : ViewModel(), KoinComponent {
  val registerKhModel: MutableLiveData<RegisterKhModel> = MutableLiveData(RegisterKhModel())

  var navArguments: Bundle? = null
}
