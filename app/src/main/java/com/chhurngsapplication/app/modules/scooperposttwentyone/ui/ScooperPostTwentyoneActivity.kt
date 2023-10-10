package com.chhurngsapplication.app.modules.scooperposttwentyone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentyoneBinding
import com.chhurngsapplication.app.modules.scooperposttwentyone.`data`.viewmodel.ScooperPostTwentyoneVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentyoneActivity :
    BaseActivity<ActivityScooperPostTwentyoneBinding>(R.layout.activity_scooper_post_twentyone) {
  private val viewModel: ScooperPostTwentyoneVM by viewModels<ScooperPostTwentyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYONE_ACTIVITY"

  }
}
