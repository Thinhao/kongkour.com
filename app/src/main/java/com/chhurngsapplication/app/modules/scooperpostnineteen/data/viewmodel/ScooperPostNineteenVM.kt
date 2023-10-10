package com.chhurngsapplication.app.modules.scooperpostnineteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostnineteen.`data`.model.ScooperPostNineteenModel
import org.koin.core.KoinComponent

class ScooperPostNineteenVM : ViewModel(), KoinComponent {
  val scooperPostNineteenModel: MutableLiveData<ScooperPostNineteenModel> =
      MutableLiveData(ScooperPostNineteenModel())

  var navArguments: Bundle? = null
}
