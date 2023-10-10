package com.chhurngsapplication.app.modules.profilegallerytwentythree.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryTwentythreeBinding
import com.chhurngsapplication.app.modules.mathin.ui.MathinActivity
import com.chhurngsapplication.app.modules.profilegallerytwentythree.`data`.model.StaggeredRowModel
import com.chhurngsapplication.app.modules.profilegallerytwentythree.`data`.viewmodel.ProfileGalleryTwentythreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryTwentythreeActivity :
    BaseActivity<ActivityProfileGalleryTwentythreeBinding>(R.layout.activity_profile_gallery_twentythree)
    {
  private val viewModel: ProfileGalleryTwentythreeVM by viewModels<ProfileGalleryTwentythreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StaggeredRowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryTwentythreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = MathinActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: StaggeredRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_TWENTYTHREE_ACTIVITY"

  }
}
