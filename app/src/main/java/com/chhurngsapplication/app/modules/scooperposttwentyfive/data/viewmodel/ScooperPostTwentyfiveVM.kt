package com.chhurngsapplication.app.modules.scooperposttwentyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentyfive.`data`.model.ScooperPostTwentyfiveModel
import org.koin.core.KoinComponent

class ScooperPostTwentyfiveVM : ViewModel(), KoinComponent {
  val scooperPostTwentyfiveModel: MutableLiveData<ScooperPostTwentyfiveModel> =
      MutableLiveData(ScooperPostTwentyfiveModel())

  var navArguments: Bundle? = null
}
