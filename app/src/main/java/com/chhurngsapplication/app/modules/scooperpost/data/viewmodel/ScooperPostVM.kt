package com.chhurngsapplication.app.modules.scooperpost.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpost.`data`.model.ScooperPostModel
import org.koin.core.KoinComponent

class ScooperPostVM : ViewModel(), KoinComponent {
  val scooperPostModel: MutableLiveData<ScooperPostModel> = MutableLiveData(ScooperPostModel())

  var navArguments: Bundle? = null
}
