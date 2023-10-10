package com.chhurngsapplication.app.modules.mathinone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.mathinone.`data`.model.MathinOneModel
import com.chhurngsapplication.app.modules.mathinone.`data`.model.MathinOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MathinOneVM : ViewModel(), KoinComponent {
  val mathinOneModel: MutableLiveData<MathinOneModel> = MutableLiveData(MathinOneModel())

  var navArguments: Bundle? = null

  val mathinOneList: MutableLiveData<MutableList<MathinOneRowModel>> =
      MutableLiveData(mutableListOf())
}
