package com.chhurngsapplication.app.modules.likenine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.likenine.`data`.model.LikeNineModel
import com.chhurngsapplication.app.modules.likenine.`data`.model.LikeNineRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LikeNineVM : ViewModel(), KoinComponent {
  val likeNineModel: MutableLiveData<LikeNineModel> = MutableLiveData(LikeNineModel())

  var navArguments: Bundle? = null

  val likeNineList: MutableLiveData<MutableList<LikeNineRowModel>> =
      MutableLiveData(mutableListOf())
}
