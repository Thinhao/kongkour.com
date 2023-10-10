package com.chhurngsapplication.app.modules.scooperpostfifteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostFifteenBinding
import com.chhurngsapplication.app.modules.scooperpostfifteen.`data`.viewmodel.ScooperPostFifteenVM
import kotlin.String
import kotlin.Unit

class ScooperPostFifteenActivity :
    BaseActivity<ActivityScooperPostFifteenBinding>(R.layout.activity_scooper_post_fifteen) {
  private val viewModel: ScooperPostFifteenVM by viewModels<ScooperPostFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_FIFTEEN_ACTIVITY"

  }
}
