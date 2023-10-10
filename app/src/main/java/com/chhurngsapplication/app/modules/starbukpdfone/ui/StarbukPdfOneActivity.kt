package com.chhurngsapplication.app.modules.starbukpdfone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityStarbukPdfOneBinding
import com.chhurngsapplication.app.modules.starbukbrandone.ui.StarbukBrandOneActivity
import com.chhurngsapplication.app.modules.starbukpdfone.`data`.viewmodel.StarbukPdfOneVM
import kotlin.String
import kotlin.Unit

class StarbukPdfOneActivity :
    BaseActivity<ActivityStarbukPdfOneBinding>(R.layout.activity_starbuk_pdf_one) {
  private val viewModel: StarbukPdfOneVM by viewModels<StarbukPdfOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.starbukPdfOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = StarbukBrandOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "STARBUK_PDF_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, StarbukPdfOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
