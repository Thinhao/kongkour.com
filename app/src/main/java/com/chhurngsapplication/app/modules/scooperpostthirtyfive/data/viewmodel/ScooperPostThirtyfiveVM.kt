package com.chhurngsapplication.app.modules.scooperpostthirtyfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthirtyfive.`data`.model.ScooperPostThirtyfiveModel
import org.koin.core.KoinComponent

class ScooperPostThirtyfiveVM : ViewModel(), KoinComponent {
  val scooperPostThirtyfiveModel: MutableLiveData<ScooperPostThirtyfiveModel> =
      MutableLiveData(ScooperPostThirtyfiveModel())

  var navArguments: Bundle? = null
}
