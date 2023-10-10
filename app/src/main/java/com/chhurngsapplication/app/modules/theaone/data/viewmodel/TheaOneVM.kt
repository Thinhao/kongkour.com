package com.chhurngsapplication.app.modules.theaone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.theaone.`data`.model.TheaOneModel
import com.chhurngsapplication.app.modules.theaone.`data`.model.TheaOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TheaOneVM : ViewModel(), KoinComponent {
  val theaOneModel: MutableLiveData<TheaOneModel> = MutableLiveData(TheaOneModel())

  var navArguments: Bundle? = null

  val theaOneList: MutableLiveData<MutableList<TheaOneRowModel>> = MutableLiveData(mutableListOf())
}
