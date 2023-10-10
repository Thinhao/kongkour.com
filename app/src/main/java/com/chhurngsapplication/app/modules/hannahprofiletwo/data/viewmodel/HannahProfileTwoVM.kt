package com.chhurngsapplication.app.modules.hannahprofiletwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.hannahprofiletwo.`data`.model.HannahProfileTwoModel
import com.chhurngsapplication.app.modules.hannahprofiletwo.`data`.model.Staggeredrectangle1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HannahProfileTwoVM : ViewModel(), KoinComponent {
  val hannahProfileTwoModel: MutableLiveData<HannahProfileTwoModel> =
      MutableLiveData(HannahProfileTwoModel())

  var navArguments: Bundle? = null

  val staggeredrectangleList: MutableLiveData<MutableList<Staggeredrectangle1RowModel>> =
      MutableLiveData(mutableListOf())
}
