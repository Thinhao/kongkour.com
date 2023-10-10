package com.chhurngsapplication.app.modules.scooperpostsix.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostSixBinding
import com.chhurngsapplication.app.modules.scooperpostsix.`data`.viewmodel.ScooperPostSixVM
import kotlin.String
import kotlin.Unit

class ScooperPostSixActivity :
    BaseActivity<ActivityScooperPostSixBinding>(R.layout.activity_scooper_post_six) {
  private val viewModel: ScooperPostSixVM by viewModels<ScooperPostSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_SIX_ACTIVITY"

  }
}
