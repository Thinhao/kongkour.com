package com.chhurngsapplication.app.modules.scooperpostten.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostTenBinding
import com.chhurngsapplication.app.modules.scooperpostten.`data`.viewmodel.ScooperPostTenVM
import kotlin.String
import kotlin.Unit

class ScooperPostTenActivity :
    BaseActivity<ActivityScooperPostTenBinding>(R.layout.activity_scooper_post_ten) {
  private val viewModel: ScooperPostTenVM by viewModels<ScooperPostTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_TEN_ACTIVITY"

  }
}
