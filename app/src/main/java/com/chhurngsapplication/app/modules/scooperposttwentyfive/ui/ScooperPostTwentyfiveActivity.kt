package com.chhurngsapplication.app.modules.scooperposttwentyfive.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentyfiveBinding
import com.chhurngsapplication.app.modules.scooperposttwentyfive.`data`.viewmodel.ScooperPostTwentyfiveVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentyfiveActivity :
    BaseActivity<ActivityScooperPostTwentyfiveBinding>(R.layout.activity_scooper_post_twentyfive) {
  private val viewModel: ScooperPostTwentyfiveVM by viewModels<ScooperPostTwentyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYFIVE_ACTIVITY"

  }
}
