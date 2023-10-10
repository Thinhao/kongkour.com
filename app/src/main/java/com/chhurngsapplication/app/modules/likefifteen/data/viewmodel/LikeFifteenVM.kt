package com.chhurngsapplication.app.modules.likefifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likefifteen.`data`.model.LikeFifteenModel
import com.chhurngsapplication.app.modules.likefifteen.`data`.model.LikeFifteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeFifteenVM : ViewModel(), KoinComponent {
  val likeFifteenModel: MutableLiveData<LikeFifteenModel> = MutableLiveData(LikeFifteenModel())

  var navArguments: Bundle? = null

  val likeFifteenList: MutableLiveData<MutableList<LikeFifteenRowModel>> =
      MutableLiveData(mutableListOf())
}
