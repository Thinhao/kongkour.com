package com.chhurngsapplication.app.modules.thearithone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.thearithone.`data`.model.ThearithOneModel
import com.chhurngsapplication.app.modules.thearithone.`data`.model.ThearithOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ThearithOneVM : ViewModel(), KoinComponent {
  val thearithOneModel: MutableLiveData<ThearithOneModel> = MutableLiveData(ThearithOneModel())

  var navArguments: Bundle? = null

  val thearithOneList: MutableLiveData<MutableList<ThearithOneRowModel>> =
      MutableLiveData(mutableListOf())
}
