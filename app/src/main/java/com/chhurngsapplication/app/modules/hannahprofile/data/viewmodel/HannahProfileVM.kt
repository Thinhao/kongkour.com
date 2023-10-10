package com.chhurngsapplication.app.modules.hannahprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.hannahprofile.`data`.model.HannahProfileModel
import com.chhurngsapplication.app.modules.hannahprofile.`data`.model.HannahProfileRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HannahProfileVM : ViewModel(), KoinComponent {
  val hannahProfileModel: MutableLiveData<HannahProfileModel> =
      MutableLiveData(HannahProfileModel())

  var navArguments: Bundle? = null

  val hannahProfileList: MutableLiveData<MutableList<HannahProfileRowModel>> =
      MutableLiveData(mutableListOf())
}
