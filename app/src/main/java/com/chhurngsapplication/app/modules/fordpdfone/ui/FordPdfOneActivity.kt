package com.chhurngsapplication.app.modules.fordpdfone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFordPdfOneBinding
import com.chhurngsapplication.app.modules.fordbrandone.ui.FordBrandOneActivity
import com.chhurngsapplication.app.modules.fordpdfone.`data`.viewmodel.FordPdfOneVM
import kotlin.String
import kotlin.Unit

class FordPdfOneActivity : BaseActivity<ActivityFordPdfOneBinding>(R.layout.activity_ford_pdf_one) {
  private val viewModel: FordPdfOneVM by viewModels<FordPdfOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fordPdfOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = FordBrandOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FORD_PDF_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FordPdfOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
