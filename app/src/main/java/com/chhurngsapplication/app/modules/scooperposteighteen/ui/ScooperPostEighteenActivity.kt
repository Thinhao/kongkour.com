package com.chhurngsapplication.app.modules.scooperposteighteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostEighteenBinding
import com.chhurngsapplication.app.modules.scooperposteighteen.`data`.viewmodel.ScooperPostEighteenVM
import kotlin.String
import kotlin.Unit

class ScooperPostEighteenActivity :
    BaseActivity<ActivityScooperPostEighteenBinding>(R.layout.activity_scooper_post_eighteen) {
  private val viewModel: ScooperPostEighteenVM by viewModels<ScooperPostEighteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostEighteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_EIGHTEEN_ACTIVITY"

  }
}
