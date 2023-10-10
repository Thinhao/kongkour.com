package com.chhurngsapplication.app.modules.likefive.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeFiveBinding
import com.chhurngsapplication.app.modules.likefive.`data`.model.LikeFiveRowModel
import com.chhurngsapplication.app.modules.likefive.`data`.viewmodel.LikeFiveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeFiveActivity : BaseActivity<ActivityLikeFiveBinding>(R.layout.activity_like_five) {
  private val viewModel: LikeFiveVM by viewModels<LikeFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeFiveAdapter = LikeFiveAdapter(viewModel.likeFiveList.value?:mutableListOf())
    binding.recyclerLikeFive.adapter = likeFiveAdapter
    likeFiveAdapter.setOnItemClickListener(
    object : LikeFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeFiveRowModel) {
        onClickRecyclerLikeFive(view, position, item)
      }
    }
    )
    viewModel.likeFiveList.observe(this) {
      likeFiveAdapter.updateData(it)
    }
    binding.likeFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeFive(
    view: View,
    position: Int,
    item: LikeFiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_FIVE_ACTIVITY"

  }
}
