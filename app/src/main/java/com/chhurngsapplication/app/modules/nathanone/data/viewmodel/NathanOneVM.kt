package com.chhurngsapplication.app.modules.nathanone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.nathanone.`data`.model.NathanOneModel
import com.chhurngsapplication.app.modules.nathanone.`data`.model.NathanOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NathanOneVM : ViewModel(), KoinComponent {
  val nathanOneModel: MutableLiveData<NathanOneModel> = MutableLiveData(NathanOneModel())

  var navArguments: Bundle? = null

  val nathanOneList: MutableLiveData<MutableList<NathanOneRowModel>> =
      MutableLiveData(mutableListOf())
}
