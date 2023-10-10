package com.chhurngsapplication.app.modules.layhouyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.layhouyone.`data`.model.LayhouyOneModel
import com.chhurngsapplication.app.modules.layhouyone.`data`.model.LayhouyOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LayhouyOneVM : ViewModel(), KoinComponent {
  val layhouyOneModel: MutableLiveData<LayhouyOneModel> = MutableLiveData(LayhouyOneModel())

  var navArguments: Bundle? = null

  val layhouyOneList: MutableLiveData<MutableList<LayhouyOneRowModel>> =
      MutableLiveData(mutableListOf())
}
