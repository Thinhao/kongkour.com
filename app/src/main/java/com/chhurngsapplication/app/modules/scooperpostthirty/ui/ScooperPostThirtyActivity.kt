package com.chhurngsapplication.app.modules.scooperpostthirty.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThirtyBinding
import com.chhurngsapplication.app.modules.scooperpostthirty.`data`.viewmodel.ScooperPostThirtyVM
import kotlin.String
import kotlin.Unit

class ScooperPostThirtyActivity :
    BaseActivity<ActivityScooperPostThirtyBinding>(R.layout.activity_scooper_post_thirty) {
  private val viewModel: ScooperPostThirtyVM by viewModels<ScooperPostThirtyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThirtyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THIRTY_ACTIVITY"

  }
}
