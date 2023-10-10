package com.chhurngsapplication.app.modules.scooperposttwentynine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposttwentynine.`data`.model.ScooperPostTwentynineModel
import org.koin.core.KoinComponent

class ScooperPostTwentynineVM : ViewModel(), KoinComponent {
  val scooperPostTwentynineModel: MutableLiveData<ScooperPostTwentynineModel> =
      MutableLiveData(ScooperPostTwentynineModel())

  var navArguments: Bundle? = null
}
