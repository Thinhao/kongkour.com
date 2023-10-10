package com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2024.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2024.`data`.model.HowToBuildABrandStrategiesThatWorkIn2024Model
import org.koin.core.KoinComponent

class HowToBuildABrandStrategiesThatWorkIn2024VM : ViewModel(), KoinComponent {
  val howToBuildABrandStrategiesThatWorkIn2024Model:
      MutableLiveData<HowToBuildABrandStrategiesThatWorkIn2024Model> =
      MutableLiveData(HowToBuildABrandStrategiesThatWorkIn2024Model())

  var navArguments: Bundle? = null
}
