package com.chhurngsapplication.app.modules.scooperpostthirtytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthirtytwo.`data`.model.ScooperPostThirtytwoModel
import org.koin.core.KoinComponent

class ScooperPostThirtytwoVM : ViewModel(), KoinComponent {
  val scooperPostThirtytwoModel: MutableLiveData<ScooperPostThirtytwoModel> =
      MutableLiveData(ScooperPostThirtytwoModel())

  var navArguments: Bundle? = null
}
