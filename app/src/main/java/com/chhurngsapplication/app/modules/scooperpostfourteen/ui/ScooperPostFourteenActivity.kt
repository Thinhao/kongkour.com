package com.chhurngsapplication.app.modules.scooperpostfourteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostFourteenBinding
import com.chhurngsapplication.app.modules.scooperpostfourteen.`data`.viewmodel.ScooperPostFourteenVM
import kotlin.String
import kotlin.Unit

class ScooperPostFourteenActivity :
    BaseActivity<ActivityScooperPostFourteenBinding>(R.layout.activity_scooper_post_fourteen) {
  private val viewModel: ScooperPostFourteenVM by viewModels<ScooperPostFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_FOURTEEN_ACTIVITY"

  }
}
