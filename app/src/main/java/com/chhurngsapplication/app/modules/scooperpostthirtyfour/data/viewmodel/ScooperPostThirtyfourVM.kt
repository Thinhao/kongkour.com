package com.chhurngsapplication.app.modules.scooperpostthirtyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthirtyfour.`data`.model.ScooperPostThirtyfourModel
import org.koin.core.KoinComponent

class ScooperPostThirtyfourVM : ViewModel(), KoinComponent {
  val scooperPostThirtyfourModel: MutableLiveData<ScooperPostThirtyfourModel> =
      MutableLiveData(ScooperPostThirtyfourModel())

  var navArguments: Bundle? = null
}
