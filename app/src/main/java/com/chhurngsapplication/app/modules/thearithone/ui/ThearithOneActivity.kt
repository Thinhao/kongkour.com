package com.chhurngsapplication.app.modules.thearithone.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityThearithOneBinding
import com.chhurngsapplication.app.modules.thearithone.`data`.model.ThearithOneRowModel
import com.chhurngsapplication.app.modules.thearithone.`data`.viewmodel.ThearithOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ThearithOneActivity : BaseActivity<ActivityThearithOneBinding>(R.layout.activity_thearith_one)
    {
  private val viewModel: ThearithOneVM by viewModels<ThearithOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val thearithOneAdapter =
    ThearithOneAdapter(viewModel.thearithOneList.value?:mutableListOf())
    binding.recyclerThearithOne.adapter = thearithOneAdapter
    thearithOneAdapter.setOnItemClickListener(
    object : ThearithOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ThearithOneRowModel) {
        onClickRecyclerThearithOne(view, position, item)
      }
    }
    )
    viewModel.thearithOneList.observe(this) {
      thearithOneAdapter.updateData(it)
    }
    binding.thearithOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerThearithOne(
    view: View,
    position: Int,
    item: ThearithOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "THEARITH_ONE_ACTIVITY"

  }
}
