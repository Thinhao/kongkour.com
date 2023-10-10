package com.chhurngsapplication.app.modules.sixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ListplaceholderFive1RowModel
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ListplaceholderFour1RowModel
import com.chhurngsapplication.app.modules.sixteen.`data`.model.SixteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SixteenVM : ViewModel(), KoinComponent {
  val sixteenModel: MutableLiveData<SixteenModel> = MutableLiveData(SixteenModel())

  var navArguments: Bundle? = null

  val listplaceholderFourList: MutableLiveData<MutableList<ListplaceholderFour1RowModel>> =
      MutableLiveData(mutableListOf())

  val listplaceholderFiveList: MutableLiveData<MutableList<ListplaceholderFive1RowModel>> =
      MutableLiveData(mutableListOf())
}
