package com.chhurngsapplication.app.modules.scooperpostten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostten.`data`.model.ScooperPostTenModel
import org.koin.core.KoinComponent

class ScooperPostTenVM : ViewModel(), KoinComponent {
  val scooperPostTenModel: MutableLiveData<ScooperPostTenModel> =
      MutableLiveData(ScooperPostTenModel())

  var navArguments: Bundle? = null
}
