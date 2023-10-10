package com.chhurngsapplication.app.modules.profilegallerytwentytwo.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryTwentytwoBinding
import com.chhurngsapplication.app.modules.profilegallerytwentytwo.`data`.model.Staggered7RowModel
import com.chhurngsapplication.app.modules.profilegallerytwentytwo.`data`.viewmodel.ProfileGalleryTwentytwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryTwentytwoActivity :
    BaseActivity<ActivityProfileGalleryTwentytwoBinding>(R.layout.activity_profile_gallery_twentytwo)
    {
  private val viewModel: ProfileGalleryTwentytwoVM by viewModels<ProfileGalleryTwentytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered7RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryTwentytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered7RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_TWENTYTWO_ACTIVITY"

  }
}
