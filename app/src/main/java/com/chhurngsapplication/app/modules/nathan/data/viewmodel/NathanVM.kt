package com.chhurngsapplication.app.modules.nathan.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.nathan.`data`.model.NathanModel
import com.chhurngsapplication.app.modules.nathan.`data`.model.NathanRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NathanVM : ViewModel(), KoinComponent {
  val nathanModel: MutableLiveData<NathanModel> = MutableLiveData(NathanModel())

  var navArguments: Bundle? = null

  val nathanList: MutableLiveData<MutableList<NathanRowModel>> = MutableLiveData(mutableListOf())
}
