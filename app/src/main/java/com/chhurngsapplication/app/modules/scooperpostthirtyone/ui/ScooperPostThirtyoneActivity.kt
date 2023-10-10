package com.chhurngsapplication.app.modules.scooperpostthirtyone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThirtyoneBinding
import com.chhurngsapplication.app.modules.scooperpostthirtyone.`data`.viewmodel.ScooperPostThirtyoneVM
import kotlin.String
import kotlin.Unit

class ScooperPostThirtyoneActivity :
    BaseActivity<ActivityScooperPostThirtyoneBinding>(R.layout.activity_scooper_post_thirtyone) {
  private val viewModel: ScooperPostThirtyoneVM by viewModels<ScooperPostThirtyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThirtyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THIRTYONE_ACTIVITY"

  }
}
