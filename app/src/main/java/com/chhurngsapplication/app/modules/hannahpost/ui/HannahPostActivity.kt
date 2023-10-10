package com.chhurngsapplication.app.modules.hannahpost.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHannahPostBinding
import com.chhurngsapplication.app.modules.hannahpost.`data`.viewmodel.HannahPostVM
import kotlin.String
import kotlin.Unit

class HannahPostActivity : BaseActivity<ActivityHannahPostBinding>(R.layout.activity_hannah_post) {
  private val viewModel: HannahPostVM by viewModels<HannahPostVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hannahPostVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HANNAH_POST_ACTIVITY"

  }
}
