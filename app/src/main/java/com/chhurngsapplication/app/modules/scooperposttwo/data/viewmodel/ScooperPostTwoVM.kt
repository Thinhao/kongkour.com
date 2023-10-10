package com.chhurngsapplication.app.modules.scooperposttwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwo.`data`.model.ScooperPostTwoModel
import org.koin.core.KoinComponent

class ScooperPostTwoVM : ViewModel(), KoinComponent {
  val scooperPostTwoModel: MutableLiveData<ScooperPostTwoModel> =
      MutableLiveData(ScooperPostTwoModel())

  var navArguments: Bundle? = null
}
