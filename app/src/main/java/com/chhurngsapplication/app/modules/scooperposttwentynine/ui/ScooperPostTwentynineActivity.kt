package com.chhurngsapplication.app.modules.scooperposttwentynine.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTwentynineBinding
import com.chhurngsapplication.app.modules.scooperposttwentynine.`data`.viewmodel.ScooperPostTwentynineVM
import kotlin.String
import kotlin.Unit

class ScooperPostTwentynineActivity :
    BaseActivity<ActivityScooperPostTwentynineBinding>(R.layout.activity_scooper_post_twentynine) {
  private val viewModel: ScooperPostTwentynineVM by viewModels<ScooperPostTwentynineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTwentynineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TWENTYNINE_ACTIVITY"

  }
}
