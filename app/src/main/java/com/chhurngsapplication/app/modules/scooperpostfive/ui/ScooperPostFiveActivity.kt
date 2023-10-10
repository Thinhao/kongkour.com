package com.chhurngsapplication.app.modules.scooperpostfive.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostFiveBinding
import com.chhurngsapplication.app.modules.scooperpostfive.`data`.viewmodel.ScooperPostFiveVM
import kotlin.String
import kotlin.Unit

class ScooperPostFiveActivity :
    BaseActivity<ActivityScooperPostFiveBinding>(R.layout.activity_scooper_post_five) {
  private val viewModel: ScooperPostFiveVM by viewModels<ScooperPostFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_FIVE_ACTIVITY"

  }
}
