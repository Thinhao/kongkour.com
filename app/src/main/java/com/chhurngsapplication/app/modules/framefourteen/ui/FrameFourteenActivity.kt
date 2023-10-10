package com.chhurngsapplication.app.modules.framefourteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFrameFourteenBinding
import com.chhurngsapplication.app.modules.framefourteen.`data`.viewmodel.FrameFourteenVM
import kotlin.String
import kotlin.Unit

class FrameFourteenActivity :
    BaseActivity<ActivityFrameFourteenBinding>(R.layout.activity_frame_fourteen) {
  private val viewModel: FrameFourteenVM by viewModels<FrameFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.frameFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FRAME_FOURTEEN_ACTIVITY"

  }
}
