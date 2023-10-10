package com.chhurngsapplication.app.modules.framethirtyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.framethirtyfour.`data`.model.FrameThirtyfourModel
import org.koin.core.KoinComponent

class FrameThirtyfourVM : ViewModel(), KoinComponent {
  val frameThirtyfourModel: MutableLiveData<FrameThirtyfourModel> =
      MutableLiveData(FrameThirtyfourModel())

  var navArguments: Bundle? = null
}
