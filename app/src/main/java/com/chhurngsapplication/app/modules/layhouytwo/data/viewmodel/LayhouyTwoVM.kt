package com.chhurngsapplication.app.modules.layhouytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.layhouytwo.`data`.model.LayhouyTwoModel
import com.chhurngsapplication.app.modules.layhouytwo.`data`.model.LayhouyTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LayhouyTwoVM : ViewModel(), KoinComponent {
  val layhouyTwoModel: MutableLiveData<LayhouyTwoModel> = MutableLiveData(LayhouyTwoModel())

  var navArguments: Bundle? = null

  val layhouyTwoList: MutableLiveData<MutableList<LayhouyTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
