package com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspiration.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityTop5LogoColorTrendsOf2023ColorInspirationBinding
import com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspiration.`data`.viewmodel.Top5LogoColorTrendsOf2023ColorInspirationVM
import kotlin.String
import kotlin.Unit

class Top5LogoColorTrendsOf2023ColorInspirationActivity :
    BaseActivity<ActivityTop5LogoColorTrendsOf2023ColorInspirationBinding>(R.layout.activity_top_5_logo_color_trends_of_2023_color_inspiration)
    {
  private val viewModel: Top5LogoColorTrendsOf2023ColorInspirationVM by
      viewModels<Top5LogoColorTrendsOf2023ColorInspirationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.top5LogoColorTrendsOf2023ColorInspirationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TOP5LOGO_COLOR_TRENDS_OF2023COLOR_INSPIRATION_ACTIVITY"

  }
}
