package com.chhurngsapplication.app.modules.home.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHomeBinding
import com.chhurngsapplication.app.modules.brandingpageone.ui.BrandingPageOneActivity
import com.chhurngsapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.chhurngsapplication.app.modules.layhouythree.ui.LayhouyThreeActivity
import com.chhurngsapplication.app.modules.layhouytwo.ui.LayhouyTwoActivity
import com.chhurngsapplication.app.modules.mathin.ui.MathinActivity
import com.chhurngsapplication.app.modules.nathanone.ui.NathanOneActivity
import com.chhurngsapplication.app.modules.thea.ui.TheaActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
    setUpSearchViewGroupNinetyNineListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearBrian.setOnClickListener {
      val destIntent = LayhouyThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMord6.setOnClickListener {
      val destIntent = LayhouyTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcomputer.setOnClickListener {
      val destIntent = BrandingPageOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcloseTwo.setOnClickListener {
      val destIntent = MathinActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowlanguageTwelve.setOnClickListener {
      val destIntent = LayhouyThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowclose.setOnClickListener {
      val destIntent = NathanOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowlocationEight.setOnClickListener {
      val destIntent = TheaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewGroupNinetyNineListener(): Unit {
    binding.searchViewGroupNinetyNine.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"

    }
  }
