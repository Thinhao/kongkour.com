package com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2023.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2023.`data`.model.HowToBuildABrandStrategiesThatWorkIn2023Model
import org.koin.core.KoinComponent

class HowToBuildABrandStrategiesThatWorkIn2023VM : ViewModel(), KoinComponent {
  val howToBuildABrandStrategiesThatWorkIn2023Model:
      MutableLiveData<HowToBuildABrandStrategiesThatWorkIn2023Model> =
      MutableLiveData(HowToBuildABrandStrategiesThatWorkIn2023Model())

  var navArguments: Bundle? = null
}
