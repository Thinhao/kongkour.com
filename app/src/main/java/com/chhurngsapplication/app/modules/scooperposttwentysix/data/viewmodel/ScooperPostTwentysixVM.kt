package com.chhurngsapplication.app.modules.scooperposttwentysix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentysix.`data`.model.ScooperPostTwentysixModel
import org.koin.core.KoinComponent

class ScooperPostTwentysixVM : ViewModel(), KoinComponent {
  val scooperPostTwentysixModel: MutableLiveData<ScooperPostTwentysixModel> =
      MutableLiveData(ScooperPostTwentysixModel())

  var navArguments: Bundle? = null
}
