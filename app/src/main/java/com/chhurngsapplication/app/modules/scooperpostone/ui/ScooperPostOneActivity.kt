package com.chhurngsapplication.app.modules.scooperpostone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostOneBinding
import com.chhurngsapplication.app.modules.scooperpostone.`data`.viewmodel.ScooperPostOneVM
import kotlin.String
import kotlin.Unit

class ScooperPostOneActivity :
    BaseActivity<ActivityScooperPostOneBinding>(R.layout.activity_scooper_post_one) {
  private val viewModel: ScooperPostOneVM by viewModels<ScooperPostOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_ONE_ACTIVITY"

  }
}
