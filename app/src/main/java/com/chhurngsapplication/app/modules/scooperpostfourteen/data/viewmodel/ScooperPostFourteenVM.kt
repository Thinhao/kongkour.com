package com.chhurngsapplication.app.modules.scooperpostfourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostfourteen.`data`.model.ScooperPostFourteenModel
import org.koin.core.KoinComponent

class ScooperPostFourteenVM : ViewModel(), KoinComponent {
  val scooperPostFourteenModel: MutableLiveData<ScooperPostFourteenModel> =
      MutableLiveData(ScooperPostFourteenModel())

  var navArguments: Bundle? = null
}
