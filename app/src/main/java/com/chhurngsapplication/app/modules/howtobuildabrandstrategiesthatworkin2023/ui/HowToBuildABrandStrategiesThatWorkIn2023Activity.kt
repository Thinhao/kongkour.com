package com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2023.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHowToBuildABrandStrategiesThatWorkIn2023Binding
import com.chhurngsapplication.app.modules.howtobuildabrandstrategiesthatworkin2023.`data`.viewmodel.HowToBuildABrandStrategiesThatWorkIn2023VM
import kotlin.String
import kotlin.Unit

class HowToBuildABrandStrategiesThatWorkIn2023Activity :
    BaseActivity<ActivityHowToBuildABrandStrategiesThatWorkIn2023Binding>(R.layout.activity_how_to_build_a_brand_strategies_that_work_in_2023)
    {
  private val viewModel: HowToBuildABrandStrategiesThatWorkIn2023VM by
      viewModels<HowToBuildABrandStrategiesThatWorkIn2023VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.howToBuildABrandStrategiesThatWorkIn2023VM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HOW_TO_BUILD_A_BRAND_STRATEGIES_THAT_WORK_IN2023ACTIVITY"

  }
}
