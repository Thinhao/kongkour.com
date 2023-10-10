package com.chhurngsapplication.app.modules.scooperposteighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperposteighteen.`data`.model.ScooperPostEighteenModel
import org.koin.core.KoinComponent

class ScooperPostEighteenVM : ViewModel(), KoinComponent {
  val scooperPostEighteenModel: MutableLiveData<ScooperPostEighteenModel> =
      MutableLiveData(ScooperPostEighteenModel())

  var navArguments: Bundle? = null
}
