package com.chhurngsapplication.app.modules.likenine.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeNineBinding
import com.chhurngsapplication.app.modules.likenine.`data`.model.LikeNineRowModel
import com.chhurngsapplication.app.modules.likenine.`data`.viewmodel.LikeNineVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeNineActivity : BaseActivity<ActivityLikeNineBinding>(R.layout.activity_like_nine) {
  private val viewModel: LikeNineVM by viewModels<LikeNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeNineAdapter = LikeNineAdapter(viewModel.likeNineList.value?:mutableListOf())
    binding.recyclerLikeNine.adapter = likeNineAdapter
    likeNineAdapter.setOnItemClickListener(
    object : LikeNineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeNineRowModel) {
        onClickRecyclerLikeNine(view, position, item)
      }
    }
    )
    viewModel.likeNineList.observe(this) {
      likeNineAdapter.updateData(it)
    }
    binding.likeNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeNine(
    view: View,
    position: Int,
    item: LikeNineRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_NINE_ACTIVITY"

  }
}
