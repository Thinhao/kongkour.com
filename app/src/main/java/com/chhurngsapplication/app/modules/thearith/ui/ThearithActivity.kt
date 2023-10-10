package com.chhurngsapplication.app.modules.thearith.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityThearithBinding
import com.chhurngsapplication.app.modules.thearith.`data`.model.ThearithRowModel
import com.chhurngsapplication.app.modules.thearith.`data`.viewmodel.ThearithVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ThearithActivity : BaseActivity<ActivityThearithBinding>(R.layout.activity_thearith) {
  private val viewModel: ThearithVM by viewModels<ThearithVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val thearithAdapter = ThearithAdapter(viewModel.thearithList.value?:mutableListOf())
    binding.recyclerThearith.adapter = thearithAdapter
    thearithAdapter.setOnItemClickListener(
    object : ThearithAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ThearithRowModel) {
        onClickRecyclerThearith(view, position, item)
      }
    }
    )
    viewModel.thearithList.observe(this) {
      thearithAdapter.updateData(it)
    }
    binding.thearithVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerThearith(
    view: View,
    position: Int,
    item: ThearithRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "THEARITH_ACTIVITY"

  }
}
