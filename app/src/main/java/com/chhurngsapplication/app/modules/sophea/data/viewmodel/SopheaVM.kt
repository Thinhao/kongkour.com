package com.chhurngsapplication.app.modules.sophea.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.sophea.`data`.model.SopheaModel
import com.chhurngsapplication.app.modules.sophea.`data`.model.SopheaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SopheaVM : ViewModel(), KoinComponent {
  val sopheaModel: MutableLiveData<SopheaModel> = MutableLiveData(SopheaModel())

  var navArguments: Bundle? = null

  val sopheaList: MutableLiveData<MutableList<SopheaRowModel>> = MutableLiveData(mutableListOf())
}
