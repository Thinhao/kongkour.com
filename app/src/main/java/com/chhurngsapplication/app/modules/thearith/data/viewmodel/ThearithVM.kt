package com.chhurngsapplication.app.modules.thearith.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.thearith.`data`.model.ThearithModel
import com.chhurngsapplication.app.modules.thearith.`data`.model.ThearithRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ThearithVM : ViewModel(), KoinComponent {
  val thearithModel: MutableLiveData<ThearithModel> = MutableLiveData(ThearithModel())

  var navArguments: Bundle? = null

  val thearithList: MutableLiveData<MutableList<ThearithRowModel>> =
      MutableLiveData(mutableListOf())
}
