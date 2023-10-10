package com.chhurngsapplication.app.modules.kayvey.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.kayvey.`data`.model.KayveyModel
import com.chhurngsapplication.app.modules.kayvey.`data`.model.KayveyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KayveyVM : ViewModel(), KoinComponent {
  val kayveyModel: MutableLiveData<KayveyModel> = MutableLiveData(KayveyModel())

  var navArguments: Bundle? = null

  val kayveyList: MutableLiveData<MutableList<KayveyRowModel>> = MutableLiveData(mutableListOf())
}
