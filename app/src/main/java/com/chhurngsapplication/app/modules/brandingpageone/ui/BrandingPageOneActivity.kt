package com.chhurngsapplication.app.modules.brandingpageone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityBrandingPageOneBinding
import com.chhurngsapplication.app.modules.amdbrandone.ui.AmdBrandOneActivity
import com.chhurngsapplication.app.modules.brandingpageone.`data`.model.ListplaceyourdesiThreeRowModel
import com.chhurngsapplication.app.modules.brandingpageone.`data`.viewmodel.BrandingPageOneVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class BrandingPageOneActivity :
    BaseActivity<ActivityBrandingPageOneBinding>(R.layout.activity_branding_page_one) {
  private val viewModel: BrandingPageOneVM by viewModels<BrandingPageOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listplaceyourdesiThreeAdapter =
    ListplaceyourdesiThreeAdapter(viewModel.listplaceyourdesiThreeList.value?:mutableListOf())
    binding.recyclerListplaceyourdesiThree.adapter = listplaceyourdesiThreeAdapter
    listplaceyourdesiThreeAdapter.setOnItemClickListener(
    object : ListplaceyourdesiThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListplaceyourdesiThreeRowModel) {
        onClickRecyclerListplaceyourdesiThree(view, position, item)
      }
    }
    )
    viewModel.listplaceyourdesiThreeList.observe(this) {
      listplaceyourdesiThreeAdapter.updateData(it)
    }
    binding.brandingPageOneVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageUntitled1zTwo.setOnClickListener {
      val destIntent = AmdBrandOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnplaceyourdesi.setOnClickListener {
      val destIntent = AmdBrandOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListplaceyourdesiThree(
    view: View,
    position: Int,
    item: ListplaceyourdesiThreeRowModel
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
      const val TAG: String = "BRANDING_PAGE_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, BrandingPageOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
