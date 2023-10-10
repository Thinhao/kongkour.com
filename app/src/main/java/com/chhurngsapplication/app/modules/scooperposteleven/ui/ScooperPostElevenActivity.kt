package com.chhurngsapplication.app.modules.scooperposteleven.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostElevenBinding
import com.chhurngsapplication.app.modules.scooperposteleven.`data`.viewmodel.ScooperPostElevenVM
import kotlin.String
import kotlin.Unit

class ScooperPostElevenActivity :
    BaseActivity<ActivityScooperPostElevenBinding>(R.layout.activity_scooper_post_eleven) {
  private val viewModel: ScooperPostElevenVM by viewModels<ScooperPostElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_ELEVEN_ACTIVITY"

  }
}
