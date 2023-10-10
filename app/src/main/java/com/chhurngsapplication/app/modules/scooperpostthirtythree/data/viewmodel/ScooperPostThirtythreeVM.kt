package com.chhurngsapplication.app.modules.scooperpostthirtythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthirtythree.`data`.model.ScooperPostThirtythreeModel
import org.koin.core.KoinComponent

class ScooperPostThirtythreeVM : ViewModel(), KoinComponent {
  val scooperPostThirtythreeModel: MutableLiveData<ScooperPostThirtythreeModel> =
      MutableLiveData(ScooperPostThirtythreeModel())

  var navArguments: Bundle? = null
}
