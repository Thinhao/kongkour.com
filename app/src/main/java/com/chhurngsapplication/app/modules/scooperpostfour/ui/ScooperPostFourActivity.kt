package com.chhurngsapplication.app.modules.scooperpostfour.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostFourBinding
import com.chhurngsapplication.app.modules.scooperpostfour.`data`.viewmodel.ScooperPostFourVM
import kotlin.String
import kotlin.Unit

class ScooperPostFourActivity :
    BaseActivity<ActivityScooperPostFourBinding>(R.layout.activity_scooper_post_four) {
  private val viewModel: ScooperPostFourVM by viewModels<ScooperPostFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_FOUR_ACTIVITY"

  }
}
