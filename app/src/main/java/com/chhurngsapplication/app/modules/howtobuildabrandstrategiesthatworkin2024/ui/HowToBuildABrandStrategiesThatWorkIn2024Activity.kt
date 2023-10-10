package com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2024.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHowToBuildABrandStrategiesThatWorkIn2024Binding
import com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2024.`data`.viewmodel.HowToBuildABrandStrategiesThatWorkIn2024VM
import kotlin.String
import kotlin.Unit

class HowToBuildABrandStrategiesThatWorkIn2024Activity :
    BaseActivity<ActivityHowToBuildABrandStrategiesThatWorkIn2024Binding>(R.layout.activity_how_to_build_a_brand_strategies_that_work_in_2024)
    {
  private val viewModel: HowToBuildABrandStrategiesThatWorkIn2024VM by
      viewModels<HowToBuildABrandStrategiesThatWorkIn2024VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.howToBuildABrandStrategiesThatWorkIn2024VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HOW_TO_BUILD_A_BRAND_STRATEGIES_THAT_WORK_IN2024ACTIVITY"

  }
}
