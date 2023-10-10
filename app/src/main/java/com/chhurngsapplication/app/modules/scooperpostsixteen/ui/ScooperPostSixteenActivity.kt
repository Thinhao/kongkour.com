package com.chhurngsapplication.app.modules.scooperpostsixteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostSixteenBinding
import com.chhurngsapplication.app.modules.scooperpostsixteen.`data`.viewmodel.ScooperPostSixteenVM
import kotlin.String
import kotlin.Unit

class ScooperPostSixteenActivity :
    BaseActivity<ActivityScooperPostSixteenBinding>(R.layout.activity_scooper_post_sixteen) {
  private val viewModel: ScooperPostSixteenVM by viewModels<ScooperPostSixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostSixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_SIXTEEN_ACTIVITY"

  }
}
