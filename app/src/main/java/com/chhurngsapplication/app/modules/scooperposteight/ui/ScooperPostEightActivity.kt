package com.chhurngsapplication.app.modules.scooperposteight.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostEightBinding
import com.chhurngsapplication.app.modules.scooperposteight.`data`.viewmodel.ScooperPostEightVM
import kotlin.String
import kotlin.Unit

class ScooperPostEightActivity :
    BaseActivity<ActivityScooperPostEightBinding>(R.layout.activity_scooper_post_eight) {
  private val viewModel: ScooperPostEightVM by viewModels<ScooperPostEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_EIGHT_ACTIVITY"

  }
}
