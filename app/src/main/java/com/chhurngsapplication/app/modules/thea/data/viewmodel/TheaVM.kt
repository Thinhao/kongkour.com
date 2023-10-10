package com.chhurngsapplication.app.modules.thea.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.thea.`data`.model.TheaModel
import com.chhurngsapplication.app.modules.thea.`data`.model.TheaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TheaVM : ViewModel(), KoinComponent {
  val theaModel: MutableLiveData<TheaModel> = MutableLiveData(TheaModel())

  var navArguments: Bundle? = null

  val theaList: MutableLiveData<MutableList<TheaRowModel>> = MutableLiveData(mutableListOf())
}
