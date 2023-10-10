package com.chhurngsapplication.app.modules.framefifteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFrameFifteenBinding
import com.chhurngsapplication.app.modules.framefifteen.`data`.viewmodel.FrameFifteenVM
import kotlin.String
import kotlin.Unit

class FrameFifteenActivity :
    BaseActivity<ActivityFrameFifteenBinding>(R.layout.activity_frame_fifteen) {
  private val viewModel: FrameFifteenVM by viewModels<FrameFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_FIFTEEN_ACTIVITY"

  }
}
