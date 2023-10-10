package com.chhurngsapplication.app.modules.profilegallerythree.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryThreeBinding
import com.chhurngsapplication.app.modules.kayveyone.ui.KayveyOneActivity
import com.chhurngsapplication.app.modules.profilegallerythree.`data`.model.Staggered23RowModel
import com.chhurngsapplication.app.modules.profilegallerythree.`data`.viewmodel.ProfileGalleryThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryThreeActivity :
    BaseActivity<ActivityProfileGalleryThreeBinding>(R.layout.activity_profile_gallery_three) {
  private val viewModel: ProfileGalleryThreeVM by viewModels<ProfileGalleryThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered23RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = KayveyOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered23RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_THREE_ACTIVITY"

  }
}
