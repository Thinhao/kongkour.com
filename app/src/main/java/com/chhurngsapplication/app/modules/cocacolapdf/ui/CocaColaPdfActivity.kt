package com.chhurngsapplication.app.modules.cocacolapdf.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCocaColaPdfBinding
import com.chhurngsapplication.app.modules.cocacolabrandone.ui.CocaColaBrandOneActivity
import com.chhurngsapplication.app.modules.cocacolapdf.`data`.viewmodel.CocaColaPdfVM
import kotlin.String
import kotlin.Unit

class CocaColaPdfActivity :
    BaseActivity<ActivityCocaColaPdfBinding>(R.layout.activity_coca_cola_pdf) {
  private val viewModel: CocaColaPdfVM by viewModels<CocaColaPdfVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cocaColaPdfVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.frameStackarrowleft.setOnClickListener {
      val destIntent = CocaColaBrandOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COCA_COLA_PDF_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CocaColaPdfActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
