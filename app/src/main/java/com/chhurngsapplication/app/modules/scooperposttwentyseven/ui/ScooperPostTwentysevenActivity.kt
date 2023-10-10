package com.chhurngsapplication.app.modules.scooperposttwentyseven.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentysevenBinding
import com.chhurngsapplication.app.modules.scooperposttwentyseven.`data`.viewmodel.ScooperPostTwentysevenVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentysevenActivity :
    BaseActivity<ActivityScooperPostTwentysevenBinding>(R.layout.activity_scooper_post_twentyseven)
    {
  private val viewModel: ScooperPostTwentysevenVM by viewModels<ScooperPostTwentysevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentysevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYSEVEN_ACTIVITY"

  }
}
