package com.chhurngsapplication.app.modules.scooperpostthirtyfive.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThirtyfiveBinding
import com.chhurngsapplication.app.modules.scooperpostthirtyfive.`data`.viewmodel.ScooperPostThirtyfiveVM
import kotlin.String
import kotlin.Unit

class ScooperPostThirtyfiveActivity :
    BaseActivity<ActivityScooperPostThirtyfiveBinding>(R.layout.activity_scooper_post_thirtyfive) {
  private val viewModel: ScooperPostThirtyfiveVM by viewModels<ScooperPostThirtyfiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThirtyfiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THIRTYFIVE_ACTIVITY"

  }
}
