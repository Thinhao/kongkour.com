package com.chhurngsapplication.app.modules.scooperpostseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostseven.`data`.model.ScooperPostSevenModel
import org.koin.core.KoinComponent

class ScooperPostSevenVM : ViewModel(), KoinComponent {
  val scooperPostSevenModel: MutableLiveData<ScooperPostSevenModel> =
      MutableLiveData(ScooperPostSevenModel())

  var navArguments: Bundle? = null
}
