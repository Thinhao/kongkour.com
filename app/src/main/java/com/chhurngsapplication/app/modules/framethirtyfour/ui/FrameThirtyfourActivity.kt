package com.chhurngsapplication.app.modules.framethirtyfour.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFrameThirtyfourBinding
import com.chhurngsapplication.app.modules.framethirtyfour.`data`.viewmodel.FrameThirtyfourVM
import kotlin.String
import kotlin.Unit

class FrameThirtyfourActivity :
    BaseActivity<ActivityFrameThirtyfourBinding>(R.layout.activity_frame_thirtyfour) {
  private val viewModel: FrameThirtyfourVM by viewModels<FrameThirtyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameThirtyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_THIRTYFOUR_ACTIVITY"

  }
}
