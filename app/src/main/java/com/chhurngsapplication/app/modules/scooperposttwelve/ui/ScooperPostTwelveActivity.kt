package com.chhurngsapplication.app.modules.scooperposttwelve.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwelveBinding
import com.chhurngsapplication.app.modules.scooperposttwelve.`data`.viewmodel.ScooperPostTwelveVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwelveActivity :
    BaseActivity<ActivityScooperPostTwelveBinding>(R.layout.activity_scooper_post_twelve) {
  private val viewModel: ScooperPostTwelveVM by viewModels<ScooperPostTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWELVE_ACTIVITY"

  }
}
