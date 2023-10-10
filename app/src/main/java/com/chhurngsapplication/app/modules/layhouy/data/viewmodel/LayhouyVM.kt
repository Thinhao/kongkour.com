package com.chhurngsapplication.app.modules.layhouy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.layhouy.`data`.model.LayhouyModel
import com.chhurngsapplication.app.modules.layhouy.`data`.model.LayhouyRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LayhouyVM : ViewModel(), KoinComponent {
  val layhouyModel: MutableLiveData<LayhouyModel> = MutableLiveData(LayhouyModel())

  var navArguments: Bundle? = null

  val layhouyList: MutableLiveData<MutableList<LayhouyRowModel>> = MutableLiveData(mutableListOf())
}
