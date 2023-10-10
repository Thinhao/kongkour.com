package com.chhurngsapplication.app.modules.likeseventeen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeSeventeenBinding
import com.chhurngsapplication.app.modules.likeseventeen.`data`.model.ListellipsefortythreeRowModel
import com.chhurngsapplication.app.modules.likeseventeen.`data`.viewmodel.LikeSeventeenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeSeventeenActivity :
    BaseActivity<ActivityLikeSeventeenBinding>(R.layout.activity_like_seventeen) {
  private val viewModel: LikeSeventeenVM by viewModels<LikeSeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsefortythreeAdapter =
    ListellipsefortythreeAdapter(viewModel.listellipsefortythreeList.value?:mutableListOf())
    binding.recyclerListellipsefortythree.adapter = listellipsefortythreeAdapter
    listellipsefortythreeAdapter.setOnItemClickListener(
    object : ListellipsefortythreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListellipsefortythreeRowModel) {
        onClickRecyclerListellipsefortythree(view, position, item)
      }
    }
    )
    viewModel.listellipsefortythreeList.observe(this) {
      listellipsefortythreeAdapter.updateData(it)
    }
    binding.likeSeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsefortythree(
    view: View,
    position: Int,
    item: ListellipsefortythreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_SEVENTEEN_ACTIVITY"

  }
}
