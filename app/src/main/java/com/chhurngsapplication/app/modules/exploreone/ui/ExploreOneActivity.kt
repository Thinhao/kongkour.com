package com.chhurngsapplication.app.modules.exploreone.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityExploreOneBinding
import com.chhurngsapplication.app.modules.exploreone.`data`.model.ExploreOneRowModel
import com.chhurngsapplication.app.modules.exploreone.`data`.viewmodel.ExploreOneVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExploreOneActivity : BaseActivity<ActivityExploreOneBinding>(R.layout.activity_explore_one) {
  private val viewModel: ExploreOneVM by viewModels<ExploreOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val exploreOneAdapter = ExploreOneAdapter(viewModel.exploreOneList.value?:mutableListOf())
    binding.recyclerExploreOne.adapter = exploreOneAdapter
    exploreOneAdapter.setOnItemClickListener(
    object : ExploreOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ExploreOneRowModel) {
        onClickRecyclerExploreOne(view, position, item)
      }
    }
    )
    viewModel.exploreOneList.observe(this) {
      exploreOneAdapter.updateData(it)
    }
    binding.exploreOneVM = viewModel
    setUpSearchViewSearchformListener()
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerExploreOne(
    view: View,
    position: Int,
    item: ExploreOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchformListener(): Unit {
    binding.searchViewSearchform.setOnQueryTextListener(object :
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
      const val TAG: String = "EXPLORE_ONE_ACTIVITY"

    }
  }
