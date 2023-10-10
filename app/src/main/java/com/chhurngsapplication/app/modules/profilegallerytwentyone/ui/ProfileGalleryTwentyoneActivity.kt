package com.chhurngsapplication.app.modules.profilegallerytwentyone.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryTwentyoneBinding
import com.chhurngsapplication.app.modules.profilegallerytwentyone.`data`.model.Staggered20RowModel
import com.chhurngsapplication.app.modules.profilegallerytwentyone.`data`.viewmodel.ProfileGalleryTwentyoneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryTwentyoneActivity :
    BaseActivity<ActivityProfileGalleryTwentyoneBinding>(R.layout.activity_profile_gallery_twentyone)
    {
  private val viewModel: ProfileGalleryTwentyoneVM by viewModels<ProfileGalleryTwentyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered20RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryTwentyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered20RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_TWENTYONE_ACTIVITY"

  }
}
