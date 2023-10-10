package com.chhurngsapplication.app.modules.scooperposttwentyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentyone.`data`.model.ScooperPostTwentyoneModel
import org.koin.core.KoinComponent

class ScooperPostTwentyoneVM : ViewModel(), KoinComponent {
  val scooperPostTwentyoneModel: MutableLiveData<ScooperPostTwentyoneModel> =
      MutableLiveData(ScooperPostTwentyoneModel())

  var navArguments: Bundle? = null
}
