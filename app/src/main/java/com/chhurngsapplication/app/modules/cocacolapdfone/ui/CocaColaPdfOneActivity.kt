package com.chhurngsapplication.app.modules.cocacolapdfone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCocaColaPdfOneBinding
import com.chhurngsapplication.app.modules.cocacolabrand.ui.CocaColaBrandActivity
import com.chhurngsapplication.app.modules.cocacolapdfone.`data`.viewmodel.CocaColaPdfOneVM
import kotlin.String
import kotlin.Unit

class CocaColaPdfOneActivity :
    BaseActivity<ActivityCocaColaPdfOneBinding>(R.layout.activity_coca_cola_pdf_one) {
  private val viewModel: CocaColaPdfOneVM by viewModels<CocaColaPdfOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cocaColaPdfOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = CocaColaBrandActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "COCA_COLA_PDF_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CocaColaPdfOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
