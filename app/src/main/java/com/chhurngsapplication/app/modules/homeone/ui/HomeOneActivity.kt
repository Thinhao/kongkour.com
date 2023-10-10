package com.chhurngsapplication.app.modules.homeone.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityHomeOneBinding
import com.chhurngsapplication.app.modules.brandingpage.ui.BrandingPageActivity
import com.chhurngsapplication.app.modules.homeone.`data`.viewmodel.HomeOneVM
import com.chhurngsapplication.app.modules.layhouy.ui.LayhouyActivity
import com.chhurngsapplication.app.modules.layhouyone.ui.LayhouyOneActivity
import com.chhurngsapplication.app.modules.mathinone.ui.MathinOneActivity
import com.chhurngsapplication.app.modules.nathan.ui.NathanActivity
import com.chhurngsapplication.app.modules.theaone.ui.TheaOneActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class HomeOneActivity : BaseActivity<ActivityHomeOneBinding>(R.layout.activity_home_one) {
  private val viewModel: HomeOneVM by viewModels<HomeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeOneVM = viewModel
    setUpSearchViewGroup112Listener()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowlocationEight.setOnClickListener {
      val destIntent = TheaOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etLanguageOne.setOnClickListener {
      val destIntent = BrandingPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowclose.setOnClickListener {
      val destIntent = NathanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowcloseTwo.setOnClickListener {
      val destIntent = MathinOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMord6.setOnClickListener {
      val destIntent = LayhouyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowlanguageEighteen.setOnClickListener {
      val destIntent = LayhouyOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBrian.setOnClickListener {
      val destIntent = LayhouyOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewGroup112Listener(): Unit {
    binding.searchViewGroup112.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "HOME_ONE_ACTIVITY"

    }
  }
