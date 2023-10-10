package com.chhurngsapplication.app.modules.reione.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.reione.`data`.model.ReiOneModel
import com.chhurngsapplication.app.modules.reione.`data`.model.ReiOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReiOneVM : ViewModel(), KoinComponent {
  val reiOneModel: MutableLiveData<ReiOneModel> = MutableLiveData(ReiOneModel())

  var navArguments: Bundle? = null

  val reiOneList: MutableLiveData<MutableList<ReiOneRowModel>> = MutableLiveData(mutableListOf())
}
