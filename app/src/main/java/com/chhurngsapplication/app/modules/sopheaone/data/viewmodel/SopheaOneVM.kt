package com.chhurngsapplication.app.modules.sopheaone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.sopheaone.`data`.model.SopheaOneModel
import com.chhurngsapplication.app.modules.sopheaone.`data`.model.SopheaOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SopheaOneVM : ViewModel(), KoinComponent {
  val sopheaOneModel: MutableLiveData<SopheaOneModel> = MutableLiveData(SopheaOneModel())

  var navArguments: Bundle? = null

  val sopheaOneList: MutableLiveData<MutableList<SopheaOneRowModel>> =
      MutableLiveData(mutableListOf())
}
