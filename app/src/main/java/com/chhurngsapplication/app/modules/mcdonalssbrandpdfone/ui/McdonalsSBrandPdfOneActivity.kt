package com.chhurngsapplication.app.modules.mcdonalssbrandpdfone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityMcdonalsSBrandPdfOneBinding
import com.chhurngsapplication.app.modules.mcdonaldsbrand.ui.McdonaldSBrandActivity
import com.chhurngsapplication.app.modules.mcdonalssbrandpdfone.`data`.viewmodel.McdonalsSBrandPdfOneVM
import kotlin.String
import kotlin.Unit

class McdonalsSBrandPdfOneActivity :
    BaseActivity<ActivityMcdonalsSBrandPdfOneBinding>(R.layout.activity_mcdonals_s_brand_pdf_one) {
  private val viewModel: McdonalsSBrandPdfOneVM by viewModels<McdonalsSBrandPdfOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mcdonalsSBrandPdfOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = McdonaldSBrandActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MCDONALS_S_BRAND_PDF_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, McdonalsSBrandPdfOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
