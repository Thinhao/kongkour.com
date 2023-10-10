package com.chhurngsapplication.app.modules.layhouythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.layhouythree.`data`.model.LayhouyThreeModel
import com.chhurngsapplication.app.modules.layhouythree.`data`.model.LayhouyThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LayhouyThreeVM : ViewModel(), KoinComponent {
  val layhouyThreeModel: MutableLiveData<LayhouyThreeModel> = MutableLiveData(LayhouyThreeModel())

  var navArguments: Bundle? = null

  val layhouyThreeList: MutableLiveData<MutableList<LayhouyThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
