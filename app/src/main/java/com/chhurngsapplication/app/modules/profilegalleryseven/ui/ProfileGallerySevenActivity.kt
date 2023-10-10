package com.chhurngsapplication.app.modules.profilegalleryseven.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGallerySevenBinding
import com.chhurngsapplication.app.modules.profilegalleryseven.`data`.model.Staggered13RowModel
import com.chhurngsapplication.app.modules.profilegalleryseven.`data`.viewmodel.ProfileGallerySevenVM
import com.chhurngsapplication.app.modules.theaone.ui.TheaOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGallerySevenActivity :
    BaseActivity<ActivityProfileGallerySevenBinding>(R.layout.activity_profile_gallery_seven) {
  private val viewModel: ProfileGallerySevenVM by viewModels<ProfileGallerySevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered13RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGallerySevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = TheaOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered13RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_SEVEN_ACTIVITY"

  }
}
