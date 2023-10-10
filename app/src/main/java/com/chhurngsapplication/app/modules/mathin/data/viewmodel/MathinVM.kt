package com.chhurngsapplication.app.modules.mathin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.mathin.`data`.model.MathinModel
import com.chhurngsapplication.app.modules.mathin.`data`.model.MathinRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MathinVM : ViewModel(), KoinComponent {
  val mathinModel: MutableLiveData<MathinModel> = MutableLiveData(MathinModel())

  var navArguments: Bundle? = null

  val mathinList: MutableLiveData<MutableList<MathinRowModel>> = MutableLiveData(mutableListOf())
}
