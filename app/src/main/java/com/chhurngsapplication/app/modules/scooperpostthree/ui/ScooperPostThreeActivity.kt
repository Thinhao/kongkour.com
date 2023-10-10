package com.chhurngsapplication.app.modules.scooperpostthree.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThreeBinding
import com.chhurngsapplication.app.modules.scooperpostthree.`data`.viewmodel.ScooperPostThreeVM
import kotlin.String
import kotlin.Unit

class ScooperPostThreeActivity :
    BaseActivity<ActivityScooperPostThreeBinding>(R.layout.activity_scooper_post_three) {
  private val viewModel: ScooperPostThreeVM by viewModels<ScooperPostThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THREE_ACTIVITY"

  }
}
