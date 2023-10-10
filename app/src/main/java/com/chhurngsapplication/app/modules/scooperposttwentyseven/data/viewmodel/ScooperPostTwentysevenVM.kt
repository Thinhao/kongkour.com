package com.chhurngsapplication.app.modules.scooperposttwentyseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentyseven.`data`.model.ScooperPostTwentysevenModel
import org.koin.core.KoinComponent

class ScooperPostTwentysevenVM : ViewModel(), KoinComponent {
  val scooperPostTwentysevenModel: MutableLiveData<ScooperPostTwentysevenModel> =
      MutableLiveData(ScooperPostTwentysevenModel())

  var navArguments: Bundle? = null
}
