package com.chhurngsapplication.app.modules.liketen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeTenBinding
import com.chhurngsapplication.app.modules.liketen.`data`.model.LikeTenRowModel
import com.chhurngsapplication.app.modules.liketen.`data`.viewmodel.LikeTenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeTenActivity : BaseActivity<ActivityLikeTenBinding>(R.layout.activity_like_ten) {
  private val viewModel: LikeTenVM by viewModels<LikeTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeTenAdapter = LikeTenAdapter(viewModel.likeTenList.value?:mutableListOf())
    binding.recyclerLikeTen.adapter = likeTenAdapter
    likeTenAdapter.setOnItemClickListener(
    object : LikeTenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeTenRowModel) {
        onClickRecyclerLikeTen(view, position, item)
      }
    }
    )
    viewModel.likeTenList.observe(this) {
      likeTenAdapter.updateData(it)
    }
    binding.likeTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeTen(
    view: View,
    position: Int,
    item: LikeTenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_TEN_ACTIVITY"

  }
}
