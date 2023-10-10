package com.chhurngsapplication.app.modules.one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.one.`data`.model.ListplaceholderFiveRowModel
import com.chhurngsapplication.app.modules.one.`data`.model.ListplaceholderFourRowModel
import com.chhurngsapplication.app.modules.one.`data`.model.OneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OneVM : ViewModel(), KoinComponent {
  val oneModel: MutableLiveData<OneModel> = MutableLiveData(OneModel())

  var navArguments: Bundle? = null

  val listplaceholderFourList: MutableLiveData<MutableList<ListplaceholderFourRowModel>> =
      MutableLiveData(mutableListOf())

  val listplaceholderFiveList: MutableLiveData<MutableList<ListplaceholderFiveRowModel>> =
      MutableLiveData(mutableListOf())
}
