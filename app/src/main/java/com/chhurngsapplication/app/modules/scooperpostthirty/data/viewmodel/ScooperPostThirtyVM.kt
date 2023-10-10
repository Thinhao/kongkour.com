package com.chhurngsapplication.app.modules.scooperpostthirty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthirty.`data`.model.ScooperPostThirtyModel
import org.koin.core.KoinComponent

class ScooperPostThirtyVM : ViewModel(), KoinComponent {
  val scooperPostThirtyModel: MutableLiveData<ScooperPostThirtyModel> =
      MutableLiveData(ScooperPostThirtyModel())

  var navArguments: Bundle? = null
}
