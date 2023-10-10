package com.chhurngsapplication.app.modules.profilegalleryfour.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryFourBinding
import com.chhurngsapplication.app.modules.profilegalleryfour.`data`.model.Staggered15RowModel
import com.chhurngsapplication.app.modules.profilegalleryfour.`data`.viewmodel.ProfileGalleryFourVM
import com.chhurngsapplication.app.modules.sophea.ui.SopheaActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryFourActivity :
    BaseActivity<ActivityProfileGalleryFourBinding>(R.layout.activity_profile_gallery_four) {
  private val viewModel: ProfileGalleryFourVM by viewModels<ProfileGalleryFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered15RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = SopheaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered15RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_FOUR_ACTIVITY"

  }
}
