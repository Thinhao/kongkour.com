package com.chhurngsapplication.app.modules.scooperposttwentytwo.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentytwoBinding
import com.chhurngsapplication.app.modules.scooperposttwentytwo.`data`.viewmodel.ScooperPostTwentytwoVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentytwoActivity :
    BaseActivity<ActivityScooperPostTwentytwoBinding>(R.layout.activity_scooper_post_twentytwo) {
  private val viewModel: ScooperPostTwentytwoVM by viewModels<ScooperPostTwentytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYTWO_ACTIVITY"

  }
}
