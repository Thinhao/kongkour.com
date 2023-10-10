package com.chhurngsapplication.app.modules.scooperpostnineteen.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityScooperPostNineteenBinding
import com.chhurngsapplication.app.modules.scooperpostnineteen.`data`.viewmodel.ScooperPostNineteenVM
import kotlin.String
import kotlin.Unit

class ScooperPostNineteenActivity :
    BaseActivity<ActivityScooperPostNineteenBinding>(R.layout.activity_scooper_post_nineteen) {
  private val viewModel: ScooperPostNineteenVM by viewModels<ScooperPostNineteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scooperPostNineteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCOOPER_POST_NINETEEN_ACTIVITY"

  }
}
