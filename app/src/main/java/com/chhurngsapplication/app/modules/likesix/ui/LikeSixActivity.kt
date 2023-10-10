package com.chhurngsapplication.app.modules.likesix.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeSixBinding
import com.chhurngsapplication.app.modules.likesix.`data`.model.LikeSixRowModel
import com.chhurngsapplication.app.modules.likesix.`data`.viewmodel.LikeSixVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeSixActivity : BaseActivity<ActivityLikeSixBinding>(R.layout.activity_like_six) {
  private val viewModel: LikeSixVM by viewModels<LikeSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeSixAdapter = LikeSixAdapter(viewModel.likeSixList.value?:mutableListOf())
    binding.recyclerLikeSix.adapter = likeSixAdapter
    likeSixAdapter.setOnItemClickListener(
    object : LikeSixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeSixRowModel) {
        onClickRecyclerLikeSix(view, position, item)
      }
    }
    )
    viewModel.likeSixList.observe(this) {
      likeSixAdapter.updateData(it)
    }
    binding.likeSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeSix(
    view: View,
    position: Int,
    item: LikeSixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_SIX_ACTIVITY"

  }
}
