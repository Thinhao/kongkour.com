package com.chhurngsapplication.app.modules.likefourteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLikeFourteenBinding
import com.chhurngsapplication.app.modules.likefourteen.`data`.model.LikeFourteenRowModel
import com.chhurngsapplication.app.modules.likefourteen.`data`.viewmodel.LikeFourteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LikeFourteenActivity :
    BaseActivity<ActivityLikeFourteenBinding>(R.layout.activity_like_fourteen) {
  private val viewModel: LikeFourteenVM by viewModels<LikeFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val likeFourteenAdapter =
    LikeFourteenAdapter(viewModel.likeFourteenList.value?:mutableListOf())
    binding.recyclerLikeFourteen.adapter = likeFourteenAdapter
    likeFourteenAdapter.setOnItemClickListener(
    object : LikeFourteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LikeFourteenRowModel) {
        onClickRecyclerLikeFourteen(view, position, item)
      }
    }
    )
    viewModel.likeFourteenList.observe(this) {
      likeFourteenAdapter.updateData(it)
    }
    binding.likeFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLikeFourteen(
    view: View,
    position: Int,
    item: LikeFourteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIKE_FOURTEEN_ACTIVITY"

  }
}
