package com.chhurngsapplication.app.modules.amdpdf.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityAmdPdfBinding
import com.chhurngsapplication.app.modules.amdpdf.`data`.viewmodel.AmdPdfVM
import kotlin.String
import kotlin.Unit

class AmdPdfActivity : BaseActivity<ActivityAmdPdfBinding>(R.layout.activity_amd_pdf) {
  private val viewModel: AmdPdfVM by viewModels<AmdPdfVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.amdPdfVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AMD_PDF_ACTIVITY"

  }
}
