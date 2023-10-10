package com.chhurngsapplication.app.modules.profilegallery.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryBinding
import com.chhurngsapplication.app.modules.profilegallery.`data`.model.Staggered1RowModel
import com.chhurngsapplication.app.modules.profilegallery.`data`.viewmodel.ProfileGalleryVM
import com.chhurngsapplication.app.modules.thea.ui.TheaActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryActivity :
    BaseActivity<ActivityProfileGalleryBinding>(R.layout.activity_profile_gallery) {
  private val viewModel: ProfileGalleryVM by viewModels<ProfileGalleryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered1RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = TheaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_ACTIVITY"

  }
}
