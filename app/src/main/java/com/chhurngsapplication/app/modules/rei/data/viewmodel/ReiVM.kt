package com.chhurngsapplication.app.modules.rei.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.rei.`data`.model.ReiModel
import com.chhurngsapplication.app.modules.rei.`data`.model.ReiRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ReiVM : ViewModel(), KoinComponent {
  val reiModel: MutableLiveData<ReiModel> = MutableLiveData(ReiModel())

  var navArguments: Bundle? = null

  val reiList: MutableLiveData<MutableList<ReiRowModel>> = MutableLiveData(mutableListOf())
}
