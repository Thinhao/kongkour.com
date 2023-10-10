package com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspirationone.ui

import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityTop5LogoColorTrendsOf2023ColorInspirationOneBinding
import com.chhurngsapplication.app.modules.top5logocolortrendsof2023colorinspirationone.`data`.viewmodel.Top5LogoColorTrendsOf2023ColorInspirationOneVM
import kotlin.String
import kotlin.Unit

class Top5LogoColorTrendsOf2023ColorInspirationOneActivity :
    BaseActivity<ActivityTop5LogoColorTrendsOf2023ColorInspirationOneBinding>(R.layout.activity_top_5_logo_color_trends_of_2023_color_inspiration_one)
    {
  private val viewModel: Top5LogoColorTrendsOf2023ColorInspirationOneVM by
      viewModels<Top5LogoColorTrendsOf2023ColorInspirationOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.top5LogoColorTrendsOf2023ColorInspirationOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TOP5LOGO_COLOR_TRENDS_OF2023COLOR_INSPIRATION_ONE_ACTIVITY"

  }
}
