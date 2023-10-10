package com.chhurngsapplication.app.modules.profilegalleryten.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryTenBinding
import com.chhurngsapplication.app.modules.layhouyone.ui.LayhouyOneActivity
import com.chhurngsapplication.app.modules.profilegalleryten.`data`.model.Staggered21RowModel
import com.chhurngsapplication.app.modules.profilegalleryten.`data`.viewmodel.ProfileGalleryTenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryTenActivity :
    BaseActivity<ActivityProfileGalleryTenBinding>(R.layout.activity_profile_gallery_ten) {
  private val viewModel: ProfileGalleryTenVM by viewModels<ProfileGalleryTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered21RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = LayhouyOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered21RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_TEN_ACTIVITY"

  }
}
