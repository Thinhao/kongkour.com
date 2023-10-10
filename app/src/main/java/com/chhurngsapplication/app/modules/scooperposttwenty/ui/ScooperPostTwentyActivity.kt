package com.chhurngsapplication.app.modules.scooperposttwenty.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentyBinding
import com.chhurngsapplication.app.modules.scooperposttwenty.`data`.viewmodel.ScooperPostTwentyVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentyActivity :
    BaseActivity<ActivityScooperPostTwentyBinding>(R.layout.activity_scooper_post_twenty) {
  private val viewModel: ScooperPostTwentyVM by viewModels<ScooperPostTwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTY_ACTIVITY"

  }
}
