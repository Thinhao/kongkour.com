package com.chhurngsapplication.app.modules.likefourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likefourteen.`data`.model.LikeFourteenModel
import com.chhurngsapplication.app.modules.likefourteen.`data`.model.LikeFourteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeFourteenVM : ViewModel(), KoinComponent {
  val likeFourteenModel: MutableLiveData<LikeFourteenModel> = MutableLiveData(LikeFourteenModel())

  var navArguments: Bundle? = null

  val likeFourteenList: MutableLiveData<MutableList<LikeFourteenRowModel>> =
      MutableLiveData(mutableListOf())
}
