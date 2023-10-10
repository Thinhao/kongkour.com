package com.chhurngsapplication.app.modules.scooperposttwentytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentytwo.`data`.model.ScooperPostTwentytwoModel
import org.koin.core.KoinComponent

class ScooperPostTwentytwoVM : ViewModel(), KoinComponent {
  val scooperPostTwentytwoModel: MutableLiveData<ScooperPostTwentytwoModel> =
      MutableLiveData(ScooperPostTwentytwoModel())

  var navArguments: Bundle? = null
}
