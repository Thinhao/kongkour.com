package com.chhurngsapplication.app.modules.framethirtytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.framethirtytwo.`data`.model.FrameThirtytwoModel
import org.koin.core.KoinComponent

class FrameThirtytwoVM : ViewModel(), KoinComponent {
  val frameThirtytwoModel: MutableLiveData<FrameThirtytwoModel> =
      MutableLiveData(FrameThirtytwoModel())

  var navArguments: Bundle? = null
}
