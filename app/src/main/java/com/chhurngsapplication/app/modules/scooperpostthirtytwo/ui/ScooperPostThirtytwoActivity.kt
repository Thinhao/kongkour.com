package com.chhurngsapplication.app.modules.scooperpostthirtytwo.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThirtytwoBinding
import com.chhurngsapplication.app.modules.scooperpostthirtytwo.`data`.viewmodel.ScooperPostThirtytwoVM
import kotlin.String
import kotlin.Unit

class ScooperPostThirtytwoActivity :
    BaseActivity<ActivityScooperPostThirtytwoBinding>(R.layout.activity_scooper_post_thirtytwo) {
  private val viewModel: ScooperPostThirtytwoVM by viewModels<ScooperPostThirtytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThirtytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THIRTYTWO_ACTIVITY"

  }
}
