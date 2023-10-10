package com.chhurngsapplication.app.modules.scooperposttwo.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwoBinding
import com.chhurngsapplication.app.modules.scooperposttwo.`data`.viewmodel.ScooperPostTwoVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwoActivity :
    BaseActivity<ActivityScooperPostTwoBinding>(R.layout.activity_scooper_post_two) {
  private val viewModel: ScooperPostTwoVM by viewModels<ScooperPostTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWO_ACTIVITY"

  }
}
