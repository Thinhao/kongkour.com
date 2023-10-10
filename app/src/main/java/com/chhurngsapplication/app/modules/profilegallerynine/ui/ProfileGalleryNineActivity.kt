package com.chhurngsapplication.app.modules.profilegallerynine.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryNineBinding
import com.chhurngsapplication.app.modules.profilegallerynine.`data`.model.Staggered8RowModel
import com.chhurngsapplication.app.modules.profilegallerynine.`data`.viewmodel.ProfileGalleryNineVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryNineActivity :
    BaseActivity<ActivityProfileGalleryNineBinding>(R.layout.activity_profile_gallery_nine) {
  private val viewModel: ProfileGalleryNineVM by viewModels<ProfileGalleryNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered8RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered8RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_NINE_ACTIVITY"

  }
}
