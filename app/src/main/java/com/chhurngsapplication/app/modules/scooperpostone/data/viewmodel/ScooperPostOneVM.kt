package com.chhurngsapplication.app.modules.scooperpostone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostone.`data`.model.ScooperPostOneModel
import org.koin.core.KoinComponent

class ScooperPostOneVM : ViewModel(), KoinComponent {
  val scooperPostOneModel: MutableLiveData<ScooperPostOneModel> =
      MutableLiveData(ScooperPostOneModel())

  var navArguments: Bundle? = null
}
