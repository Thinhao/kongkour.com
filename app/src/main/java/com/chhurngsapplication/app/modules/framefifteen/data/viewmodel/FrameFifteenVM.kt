package com.chhurngsapplication.app.modules.framefifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.framefifteen.`data`.model.FrameFifteenModel
import org.koin.core.KoinComponent

class FrameFifteenVM : ViewModel(), KoinComponent {
  val frameFifteenModel: MutableLiveData<FrameFifteenModel> = MutableLiveData(FrameFifteenModel())

  var navArguments: Bundle? = null
}
