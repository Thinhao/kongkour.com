package com.chhurngsapplication.app.modules.hannahpostone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHannahPostOneBinding
import com.chhurngsapplication.app.modules.hannahpostone.`data`.viewmodel.HannahPostOneVM
import kotlin.String
import kotlin.Unit

class HannahPostOneActivity :
    BaseActivity<ActivityHannahPostOneBinding>(R.layout.activity_hannah_post_one) {
  private val viewModel: HannahPostOneVM by viewModels<HannahPostOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.hannahPostOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "HANNAH_POST_ONE_ACTIVITY"

  }
}
