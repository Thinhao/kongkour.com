package com.chhurngsapplication.app.modules.profilegallerytwo.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryTwoBinding
import com.chhurngsapplication.app.modules.layhouytwo.ui.LayhouyTwoActivity
import com.chhurngsapplication.app.modules.profilegallerytwo.`data`.model.Staggered10RowModel
import com.chhurngsapplication.app.modules.profilegallerytwo.`data`.viewmodel.ProfileGalleryTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryTwoActivity :
    BaseActivity<ActivityProfileGalleryTwoBinding>(R.layout.activity_profile_gallery_two) {
  private val viewModel: ProfileGalleryTwoVM by viewModels<ProfileGalleryTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered10RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = LayhouyTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered10RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_TWO_ACTIVITY"

  }
}
