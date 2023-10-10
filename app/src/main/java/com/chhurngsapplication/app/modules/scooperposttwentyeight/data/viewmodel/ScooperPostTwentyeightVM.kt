package com.chhurngsapplication.app.modules.scooperposttwentyeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentyeight.`data`.model.ScooperPostTwentyeightModel
import org.koin.core.KoinComponent

class ScooperPostTwentyeightVM : ViewModel(), KoinComponent {
  val scooperPostTwentyeightModel: MutableLiveData<ScooperPostTwentyeightModel> =
      MutableLiveData(ScooperPostTwentyeightModel())

  var navArguments: Bundle? = null
}
