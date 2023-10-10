package com.chhurngsapplication.app.modules.cocacolabrandone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityCocaColaBrandOneBinding
import com.chhurngsapplication.app.modules.cocacolabrandone.`data`.viewmodel.CocaColaBrandOneVM
import com.chhurngsapplication.app.modules.cocacolapdf.ui.CocaColaPdfActivity
import kotlin.String
import kotlin.Unit

class CocaColaBrandOneActivity :
    BaseActivity<ActivityCocaColaBrandOneBinding>(R.layout.activity_coca_cola_brand_one) {
  private val viewModel: CocaColaBrandOneVM by viewModels<CocaColaBrandOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cocaColaBrandOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btn.setOnClickListener {
      val destIntent = CocaColaPdfActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "COCA_COLA_BRAND_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CocaColaBrandOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
