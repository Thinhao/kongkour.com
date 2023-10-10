package com.chhurngsapplication.app.modules.kayveyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.kayveyone.`data`.model.KayveyOneModel
import com.chhurngsapplication.app.modules.kayveyone.`data`.model.KayveyOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class KayveyOneVM : ViewModel(), KoinComponent {
  val kayveyOneModel: MutableLiveData<KayveyOneModel> = MutableLiveData(KayveyOneModel())

  var navArguments: Bundle? = null

  val kayveyOneList: MutableLiveData<MutableList<KayveyOneRowModel>> =
      MutableLiveData(mutableListOf())
}
