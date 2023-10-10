package com.chhurngsapplication.app.modules.vannim.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityVannimBinding
import com.chhurngsapplication.app.modules.vannim.`data`.model.VannimRowModel
import com.chhurngsapplication.app.modules.vannim.`data`.viewmodel.VannimVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VannimActivity : BaseActivity<ActivityVannimBinding>(R.layout.activity_vannim) {
  private val viewModel: VannimVM by viewModels<VannimVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val vannimAdapter = VannimAdapter(viewModel.vannimList.value?:mutableListOf())
    binding.recyclerVannim.adapter = vannimAdapter
    vannimAdapter.setOnItemClickListener(
    object : VannimAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : VannimRowModel) {
        onClickRecyclerVannim(view, position, item)
      }
    }
    )
    viewModel.vannimList.observe(this) {
      vannimAdapter.updateData(it)
    }
    binding.vannimVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerVannim(
    view: View,
    position: Int,
    item: VannimRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VANNIM_ACTIVITY"

  }
}
