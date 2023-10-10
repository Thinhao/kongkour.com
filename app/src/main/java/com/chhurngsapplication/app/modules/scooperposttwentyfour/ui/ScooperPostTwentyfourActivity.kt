package com.chhurngsapplication.app.modules.scooperposttwentyfour.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentyfourBinding
import com.chhurngsapplication.app.modules.scooperposttwentyfour.`data`.viewmodel.ScooperPostTwentyfourVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentyfourActivity :
    BaseActivity<ActivityScooperPostTwentyfourBinding>(R.layout.activity_scooper_post_twentyfour) {
  private val viewModel: ScooperPostTwentyfourVM by viewModels<ScooperPostTwentyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYFOUR_ACTIVITY"

  }
}
