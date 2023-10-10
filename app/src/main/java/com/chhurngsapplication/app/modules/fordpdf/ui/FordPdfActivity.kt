package com.chhurngsapplication.app.modules.fordpdf.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityFordPdfBinding
import com.chhurngsapplication.app.modules.fordbrand.ui.FordBrandActivity
import com.chhurngsapplication.app.modules.fordpdf.`data`.viewmodel.FordPdfVM
import kotlin.String
import kotlin.Unit

class FordPdfActivity : BaseActivity<ActivityFordPdfBinding>(R.layout.activity_ford_pdf) {
  private val viewModel: FordPdfVM by viewModels<FordPdfVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fordPdfVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = FordBrandActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORD_PDF_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FordPdfActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
