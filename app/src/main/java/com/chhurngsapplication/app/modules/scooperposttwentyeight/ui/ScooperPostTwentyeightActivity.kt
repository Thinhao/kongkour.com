package com.chhurngsapplication.app.modules.scooperposttwentyeight.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentyeightBinding
import com.chhurngsapplication.app.modules.scooperposttwentyeight.`data`.viewmodel.ScooperPostTwentyeightVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentyeightActivity :
    BaseActivity<ActivityScooperPostTwentyeightBinding>(R.layout.activity_scooper_post_twentyeight)
    {
  private val viewModel: ScooperPostTwentyeightVM by viewModels<ScooperPostTwentyeightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentyeightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYEIGHT_ACTIVITY"

  }
}
