package com.chhurngsapplication.app.modules.scooperpostseventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostseventeen.`data`.model.ScooperPostSeventeenModel
import org.koin.core.KoinComponent

class ScooperPostSeventeenVM : ViewModel(), KoinComponent {
  val scooperPostSeventeenModel: MutableLiveData<ScooperPostSeventeenModel> =
      MutableLiveData(ScooperPostSeventeenModel())

  var navArguments: Bundle? = null
}
