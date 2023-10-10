package com.chhurngsapplication.app.modules.scooperpostnine.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostNineBinding
import com.chhurngsapplication.app.modules.scooperpostnine.`data`.viewmodel.ScooperPostNineVM
import kotlin.String
import kotlin.Unit

class ScooperPostNineActivity :
    BaseActivity<ActivityScooperPostNineBinding>(R.layout.activity_scooper_post_nine) {
  private val viewModel: ScooperPostNineVM by viewModels<ScooperPostNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_NINE_ACTIVITY"

  }
}
