package com.chhurngsapplication.app.modules.profilegalleryone.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryOneBinding
import com.chhurngsapplication.app.modules.layhouy.ui.LayhouyActivity
import com.chhurngsapplication.app.modules.profilegalleryone.`data`.model.Staggered22RowModel
import com.chhurngsapplication.app.modules.profilegalleryone.`data`.viewmodel.ProfileGalleryOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryOneActivity :
    BaseActivity<ActivityProfileGalleryOneBinding>(R.layout.activity_profile_gallery_one) {
  private val viewModel: ProfileGalleryOneVM by viewModels<ProfileGalleryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered22RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = LayhouyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered22RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_ONE_ACTIVITY"

  }
}
