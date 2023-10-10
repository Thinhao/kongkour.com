package com.chhurngsapplication.app.modules.profilegallerythirteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryThirteenBinding
import com.chhurngsapplication.app.modules.profilegallerythirteen.`data`.model.Staggered18RowModel
import com.chhurngsapplication.app.modules.profilegallerythirteen.`data`.viewmodel.ProfileGalleryThirteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryThirteenActivity :
    BaseActivity<ActivityProfileGalleryThirteenBinding>(R.layout.activity_profile_gallery_thirteen)
    {
  private val viewModel: ProfileGalleryThirteenVM by viewModels<ProfileGalleryThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered18RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryThirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered18RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_THIRTEEN_ACTIVITY"

  }
}
