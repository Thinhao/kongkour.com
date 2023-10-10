package com.chhurngsapplication.app.modules.scooperposttwentythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentythree.`data`.model.ScooperPostTwentythreeModel
import org.koin.core.KoinComponent

class ScooperPostTwentythreeVM : ViewModel(), KoinComponent {
  val scooperPostTwentythreeModel: MutableLiveData<ScooperPostTwentythreeModel> =
      MutableLiveData(ScooperPostTwentythreeModel())

  var navArguments: Bundle? = null
}
