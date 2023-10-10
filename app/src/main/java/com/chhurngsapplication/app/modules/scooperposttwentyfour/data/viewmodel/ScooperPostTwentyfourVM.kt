package com.chhurngsapplication.app.modules.scooperposttwentyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentyfour.`data`.model.ScooperPostTwentyfourModel
import org.koin.core.KoinComponent

class ScooperPostTwentyfourVM : ViewModel(), KoinComponent {
  val scooperPostTwentyfourModel: MutableLiveData<ScooperPostTwentyfourModel> =
      MutableLiveData(ScooperPostTwentyfourModel())

  var navArguments: Bundle? = null
}
