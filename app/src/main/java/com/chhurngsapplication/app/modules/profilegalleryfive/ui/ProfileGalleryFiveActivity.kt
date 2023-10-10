package com.chhurngsapplication.app.modules.profilegalleryfive.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryFiveBinding
import com.chhurngsapplication.app.modules.profilegalleryfive.`data`.model.Staggered5RowModel
import com.chhurngsapplication.app.modules.profilegalleryfive.`data`.viewmodel.ProfileGalleryFiveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryFiveActivity :
    BaseActivity<ActivityProfileGalleryFiveBinding>(R.layout.activity_profile_gallery_five) {
  private val viewModel: ProfileGalleryFiveVM by viewModels<ProfileGalleryFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered5RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered5RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_FIVE_ACTIVITY"

  }
}
