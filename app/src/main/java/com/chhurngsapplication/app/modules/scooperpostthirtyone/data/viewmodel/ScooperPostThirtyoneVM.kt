package com.chhurngsapplication.app.modules.scooperpostthirtyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthirtyone.`data`.model.ScooperPostThirtyoneModel
import org.koin.core.KoinComponent

class ScooperPostThirtyoneVM : ViewModel(), KoinComponent {
  val scooperPostThirtyoneModel: MutableLiveData<ScooperPostThirtyoneModel> =
      MutableLiveData(ScooperPostThirtyoneModel())

  var navArguments: Bundle? = null
}
