package com.chhurngsapplication.app.modules.scooperpostseven.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostSevenBinding
import com.chhurngsapplication.app.modules.scooperpostseven.`data`.viewmodel.ScooperPostSevenVM
import kotlin.String
import kotlin.Unit

class ScooperPostSevenActivity :
    BaseActivity<ActivityScooperPostSevenBinding>(R.layout.activity_scooper_post_seven) {
  private val viewModel: ScooperPostSevenVM by viewModels<ScooperPostSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_SEVEN_ACTIVITY"

  }
}
