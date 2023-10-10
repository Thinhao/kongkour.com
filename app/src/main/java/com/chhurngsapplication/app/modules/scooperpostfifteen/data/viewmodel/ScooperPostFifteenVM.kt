package com.chhurngsapplication.app.modules.scooperpostfifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostfifteen.`data`.model.ScooperPostFifteenModel
import org.koin.core.KoinComponent

class ScooperPostFifteenVM : ViewModel(), KoinComponent {
  val scooperPostFifteenModel: MutableLiveData<ScooperPostFifteenModel> =
      MutableLiveData(ScooperPostFifteenModel())

  var navArguments: Bundle? = null
}
