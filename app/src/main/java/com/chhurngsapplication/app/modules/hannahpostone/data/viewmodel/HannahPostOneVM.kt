package com.chhurngsapplication.app.modules.hannahpostone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.hannahpostone.`data`.model.HannahPostOneModel
import org.koin.core.KoinComponent

class HannahPostOneVM : ViewModel(), KoinComponent {
  val hannahPostOneModel: MutableLiveData<HannahPostOneModel> =
      MutableLiveData(HannahPostOneModel())

  var navArguments: Bundle? = null
}
