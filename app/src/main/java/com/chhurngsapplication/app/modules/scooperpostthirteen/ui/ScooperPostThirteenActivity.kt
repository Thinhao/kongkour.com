package com.chhurngsapplication.app.modules.scooperpostthirteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostThirteenBinding
import com.chhurngsapplication.app.modules.scooperpostthirteen.`data`.viewmodel.ScooperPostThirteenVM
import kotlin.String
import kotlin.Unit

class ScooperPostThirteenActivity :
    BaseActivity<ActivityScooperPostThirteenBinding>(R.layout.activity_scooper_post_thirteen) {
  private val viewModel: ScooperPostThirteenVM by viewModels<ScooperPostThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostThirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_THIRTEEN_ACTIVITY"

  }
}
