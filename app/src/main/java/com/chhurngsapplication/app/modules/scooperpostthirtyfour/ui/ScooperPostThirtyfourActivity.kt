package com.chhurngsapplication.app.modules.scooperpostthirtyfour.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThirtyfourBinding
import com.chhurngsapplication.app.modules.scooperpostthirtyfour.`data`.viewmodel.ScooperPostThirtyfourVM
import kotlin.String
import kotlin.Unit

class ScooperPostThirtyfourActivity :
    BaseActivity<ActivityScooperPostThirtyfourBinding>(R.layout.activity_scooper_post_thirtyfour) {
  private val viewModel: ScooperPostThirtyfourVM by viewModels<ScooperPostThirtyfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThirtyfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THIRTYFOUR_ACTIVITY"

  }
}
