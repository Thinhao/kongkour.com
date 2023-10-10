package com.chhurngsapplication.app.modules.scooperpostsixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.scooperpostsixteen.`data`.model.ScooperPostSixteenModel
import org.koin.core.KoinComponent

class ScooperPostSixteenVM : ViewModel(), KoinComponent {
  val scooperPostSixteenModel: MutableLiveData<ScooperPostSixteenModel> =
      MutableLiveData(ScooperPostSixteenModel())

  var navArguments: Bundle? = null
}
