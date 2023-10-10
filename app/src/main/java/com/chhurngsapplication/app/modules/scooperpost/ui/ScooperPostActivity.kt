package com.chhurngsapplication.app.modules.scooperpost.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostBinding
import com.chhurngsapplication.app.modules.scooperpost.`data`.viewmodel.ScooperPostVM
import kotlin.String
import kotlin.Unit

class ScooperPostActivity : BaseActivity<ActivityScooperPostBinding>(R.layout.activity_scooper_post)
    {
  private val viewModel: ScooperPostVM by viewModels<ScooperPostVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_ACTIVITY"

  }
}
