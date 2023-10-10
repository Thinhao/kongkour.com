package com.chhurngsapplication.app.modules.scooperpostthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthree.`data`.model.ScooperPostThreeModel
import org.koin.core.KoinComponent

class ScooperPostThreeVM : ViewModel(), KoinComponent {
  val scooperPostThreeModel: MutableLiveData<ScooperPostThreeModel> =
      MutableLiveData(ScooperPostThreeModel())

  var navArguments: Bundle? = null
}
