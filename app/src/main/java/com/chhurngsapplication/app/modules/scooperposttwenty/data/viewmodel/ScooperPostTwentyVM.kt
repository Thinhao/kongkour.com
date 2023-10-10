package com.chhurngsapplication.app.modules.scooperposttwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwenty.`data`.model.ScooperPostTwentyModel
import org.koin.core.KoinComponent

class ScooperPostTwentyVM : ViewModel(), KoinComponent {
  val scooperPostTwentyModel: MutableLiveData<ScooperPostTwentyModel> =
      MutableLiveData(ScooperPostTwentyModel())

  var navArguments: Bundle? = null
}
