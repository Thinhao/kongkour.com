package com.chhurngsapplication.app.modules.vannimone.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityVannimOneBinding
import com.chhurngsapplication.app.modules.vannimone.`data`.model.VannimOneRowModel
import com.chhurngsapplication.app.modules.vannimone.`data`.viewmodel.VannimOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VannimOneActivity : BaseActivity<ActivityVannimOneBinding>(R.layout.activity_vannim_one) {
  private val viewModel: VannimOneVM by viewModels<VannimOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val vannimOneAdapter = VannimOneAdapter(viewModel.vannimOneList.value?:mutableListOf())
    binding.recyclerVannimOne.adapter = vannimOneAdapter
    vannimOneAdapter.setOnItemClickListener(
    object : VannimOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : VannimOneRowModel) {
        onClickRecyclerVannimOne(view, position, item)
      }
    }
    )
    viewModel.vannimOneList.observe(this) {
      vannimOneAdapter.updateData(it)
    }
    binding.vannimOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerVannimOne(
    view: View,
    position: Int,
    item: VannimOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VANNIM_ONE_ACTIVITY"

  }
}
