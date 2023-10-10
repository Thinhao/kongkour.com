package com.chhurngsapplication.app.modules.hannahpost.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.hannahpost.`data`.model.HannahPostModel
import org.koin.core.KoinComponent

class HannahPostVM : ViewModel(), KoinComponent {
  val hannahPostModel: MutableLiveData<HannahPostModel> = MutableLiveData(HannahPostModel())

  var navArguments: Bundle? = null
}
