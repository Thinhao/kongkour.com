package com.chhurngsapplication.app.modules.scooperposttwentythree.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentythreeBinding
import com.chhurngsapplication.app.modules.scooperposttwentythree.`data`.viewmodel.ScooperPostTwentythreeVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentythreeActivity :
    BaseActivity<ActivityScooperPostTwentythreeBinding>(R.layout.activity_scooper_post_twentythree)
    {
  private val viewModel: ScooperPostTwentythreeVM by viewModels<ScooperPostTwentythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYTHREE_ACTIVITY"

  }
}
