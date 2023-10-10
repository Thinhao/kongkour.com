package com.chhurngsapplication.app.modules.starbukpdf.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityStarbukPdfBinding
import com.chhurngsapplication.app.modules.starbukbrand.ui.StarbukBrandActivity
import com.chhurngsapplication.app.modules.starbukpdf.`data`.viewmodel.StarbukPdfVM
import kotlin.String
import kotlin.Unit

class StarbukPdfActivity : BaseActivity<ActivityStarbukPdfBinding>(R.layout.activity_starbuk_pdf) {
  private val viewModel: StarbukPdfVM by viewModels<StarbukPdfVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.starbukPdfVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = StarbukBrandActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "STARBUK_PDF_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StarbukPdfActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
