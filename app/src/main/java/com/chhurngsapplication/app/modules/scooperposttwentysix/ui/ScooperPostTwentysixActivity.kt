package com.chhurngsapplication.app.modules.scooperposttwentysix.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentysixBinding
import com.chhurngsapplication.app.modules.scooperposttwentysix.`data`.viewmodel.ScooperPostTwentysixVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentysixActivity :
    BaseActivity<ActivityScooperPostTwentysixBinding>(R.layout.activity_scooper_post_twentysix) {
  private val viewModel: ScooperPostTwentysixVM by viewModels<ScooperPostTwentysixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentysixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYSIX_ACTIVITY"

  }
}
