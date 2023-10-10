package com.chhurngsapplication.app.modules.brandingpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityBrandingPageBinding
import com.chhurngsapplication.app.modules.amdbrand.ui.AmdBrandActivity
import com.chhurngsapplication.app.modules.brandingpage.`data`.model.BrandingPageRowModel
import com.chhurngsapplication.app.modules.brandingpage.`data`.viewmodel.BrandingPageVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BrandingPageActivity :
    BaseActivity<ActivityBrandingPageBinding>(R.layout.activity_branding_page) {
  private val viewModel: BrandingPageVM by viewModels<BrandingPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val brandingPageAdapter =
    BrandingPageAdapter(viewModel.brandingPageList.value?:mutableListOf())
    binding.recyclerBrandingPage.adapter = brandingPageAdapter
    brandingPageAdapter.setOnItemClickListener(
    object : BrandingPageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : BrandingPageRowModel) {
        onClickRecyclerBrandingPage(view, position, item)
      }
    }
    )
    viewModel.brandingPageList.observe(this) {
      brandingPageAdapter.updateData(it)
    }
    binding.brandingPageVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageUntitled1zTwo.setOnClickListener {
      val destIntent = AmdBrandActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.linearColumnplaceyourdesi.setOnClickListener {
      val destIntent = AmdBrandActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerBrandingPage(
    view: View,
    position: Int,
    item: BrandingPageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "BRANDING_PAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, BrandingPageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
