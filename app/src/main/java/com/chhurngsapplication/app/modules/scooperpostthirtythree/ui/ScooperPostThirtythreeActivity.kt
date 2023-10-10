package com.chhurngsapplication.app.modules.scooperpostthirtythree.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThirtythreeBinding
import com.chhurngsapplication.app.modules.scooperpostthirtythree.`data`.viewmodel.ScooperPostThirtythreeVM
import kotlin.String
import kotlin.Unit

class ScooperPostThirtythreeActivity :
    BaseActivity<ActivityScooperPostThirtythreeBinding>(R.layout.activity_scooper_post_thirtythree)
    {
  private val viewModel: ScooperPostThirtythreeVM by viewModels<ScooperPostThirtythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThirtythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THIRTYTHREE_ACTIVITY"

  }
}
