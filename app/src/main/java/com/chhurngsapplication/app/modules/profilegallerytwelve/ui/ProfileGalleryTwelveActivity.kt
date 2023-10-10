package com.chhurngsapplication.app.modules.profilegallerytwelve.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryTwelveBinding
import com.chhurngsapplication.app.modules.nathan.ui.NathanActivity
import com.chhurngsapplication.app.modules.profilegallerytwelve.`data`.model.Staggered14RowModel
import com.chhurngsapplication.app.modules.profilegallerytwelve.`data`.viewmodel.ProfileGalleryTwelveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryTwelveActivity :
    BaseActivity<ActivityProfileGalleryTwelveBinding>(R.layout.activity_profile_gallery_twelve) {
  private val viewModel: ProfileGalleryTwelveVM by viewModels<ProfileGalleryTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered14RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = NathanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered14RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_TWELVE_ACTIVITY"

  }
}
