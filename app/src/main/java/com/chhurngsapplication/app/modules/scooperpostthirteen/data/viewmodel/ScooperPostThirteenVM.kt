package com.chhurngsapplication.app.modules.scooperpostthirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostthirteen.`data`.model.ScooperPostThirteenModel
import org.koin.core.KoinComponent

class ScooperPostThirteenVM : ViewModel(), KoinComponent {
  val scooperPostThirteenModel: MutableLiveData<ScooperPostThirteenModel> =
      MutableLiveData(ScooperPostThirteenModel())

  var navArguments: Bundle? = null
}
