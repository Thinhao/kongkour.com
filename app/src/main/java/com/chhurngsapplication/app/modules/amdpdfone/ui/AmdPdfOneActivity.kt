package com.chhurngsapplication.app.modules.amdpdfone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityAmdPdfOneBinding
import com.chhurngsapplication.app.modules.amdpdfone.`data`.viewmodel.AmdPdfOneVM
import kotlin.String
import kotlin.Unit

class AmdPdfOneActivity : BaseActivity<ActivityAmdPdfOneBinding>(R.layout.activity_amd_pdf_one) {
  private val viewModel: AmdPdfOneVM by viewModels<AmdPdfOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.amdPdfOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AMD_PDF_ONE_ACTIVITY"

  }
}
