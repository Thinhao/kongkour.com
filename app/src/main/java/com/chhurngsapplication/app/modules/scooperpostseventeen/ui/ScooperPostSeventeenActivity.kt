package com.chhurngsapplication.app.modules.scooperpostseventeen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostSeventeenBinding
import com.chhurngsapplication.app.modules.scooperpostseventeen.`data`.viewmodel.ScooperPostSeventeenVM
import kotlin.String
import kotlin.Unit

class ScooperPostSeventeenActivity :
    BaseActivity<ActivityScooperPostSeventeenBinding>(R.layout.activity_scooper_post_seventeen) {
  private val viewModel: ScooperPostSeventeenVM by viewModels<ScooperPostSeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostSeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_SEVENTEEN_ACTIVITY"

  }
}
