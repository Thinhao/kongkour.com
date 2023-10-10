package com.chhurngsapplication.app.modules.liketwo.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeTwoBinding
import com.chhurngsapplication.app.modules.liketwo.`data`.model.LikeTwoRowModel
import com.chhurngsapplication.app.modules.liketwo.`data`.viewmodel.LikeTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeTwoActivity : BaseActivity<ActivityLikeTwoBinding>(R.layout.activity_like_two) {
  private val viewModel: LikeTwoVM by viewModels<LikeTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeTwoAdapter = LikeTwoAdapter(viewModel.likeTwoList.value?:mutableListOf())
    binding.recyclerLikeTwo.adapter = likeTwoAdapter
    likeTwoAdapter.setOnItemClickListener(
    object : LikeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeTwoRowModel) {
        onClickRecyclerLikeTwo(view, position, item)
      }
    }
    )
    viewModel.likeTwoList.observe(this) {
      likeTwoAdapter.updateData(it)
    }
    binding.likeTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeTwo(
    view: View,
    position: Int,
    item: LikeTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_TWO_ACTIVITY"

  }
}
