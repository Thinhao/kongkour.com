package com.chhurngsapplication.app.modules.profilegalleryeleven.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryElevenBinding
import com.chhurngsapplication.app.modules.profilegalleryeleven.`data`.model.Staggered17RowModel
import com.chhurngsapplication.app.modules.profilegalleryeleven.`data`.viewmodel.ProfileGalleryElevenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryElevenActivity :
    BaseActivity<ActivityProfileGalleryElevenBinding>(R.layout.activity_profile_gallery_eleven) {
  private val viewModel: ProfileGalleryElevenVM by viewModels<ProfileGalleryElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered17RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered17RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_ELEVEN_ACTIVITY"

  }
}
