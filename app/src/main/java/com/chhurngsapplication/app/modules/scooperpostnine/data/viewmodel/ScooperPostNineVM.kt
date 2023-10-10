package com.chhurngsapplication.app.modules.scooperpostnine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostnine.`data`.model.ScooperPostNineModel
import org.koin.core.KoinComponent

class ScooperPostNineVM : ViewModel(), KoinComponent {
  val scooperPostNineModel: MutableLiveData<ScooperPostNineModel> =
      MutableLiveData(ScooperPostNineModel())

  var navArguments: Bundle? = null
}
