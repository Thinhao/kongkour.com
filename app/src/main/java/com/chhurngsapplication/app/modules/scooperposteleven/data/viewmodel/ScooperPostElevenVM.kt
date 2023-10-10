package com.chhurngsapplication.app.modules.scooperposteleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposteleven.`data`.model.ScooperPostElevenModel
import org.koin.core.KoinComponent

class ScooperPostElevenVM : ViewModel(), KoinComponent {
  val scooperPostElevenModel: MutableLiveData<ScooperPostElevenModel> =
      MutableLiveData(ScooperPostElevenModel())

  var navArguments: Bundle? = null
}
