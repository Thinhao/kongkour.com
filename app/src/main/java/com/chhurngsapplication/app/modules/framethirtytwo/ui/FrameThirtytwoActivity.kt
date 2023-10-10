package com.chhurngsapplication.app.modules.framethirtytwo.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFrameThirtytwoBinding
import com.chhurngsapplication.app.modules.framethirtytwo.`data`.viewmodel.FrameThirtytwoVM
import kotlin.String
import kotlin.Unit

class FrameThirtytwoActivity :
    BaseActivity<ActivityFrameThirtytwoBinding>(R.layout.activity_frame_thirtytwo) {
  private val viewModel: FrameThirtytwoVM by viewModels<FrameThirtytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameThirtytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_THIRTYTWO_ACTIVITY"

  }
}
