package com.chhurngsapplication.app.modules.likethirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likethirteen.`data`.model.LikeThirteenModel
import com.chhurngsapplication.app.modules.likethirteen.`data`.model.LikeThirteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeThirteenVM : ViewModel(), KoinComponent {
  val likeThirteenModel: MutableLiveData<LikeThirteenModel> = MutableLiveData(LikeThirteenModel())

  var navArguments: Bundle? = null

  val likeThirteenList: MutableLiveData<MutableList<LikeThirteenRowModel>> =
      MutableLiveData(mutableListOf())
}
