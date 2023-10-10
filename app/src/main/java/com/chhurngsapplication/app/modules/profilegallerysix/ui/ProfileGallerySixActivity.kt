package com.chhurngsapplication.app.modules.profilegallerysix.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGallerySixBinding
import com.chhurngsapplication.app.modules.profilegallerysix.`data`.model.Staggered19RowModel
import com.chhurngsapplication.app.modules.profilegallerysix.`data`.viewmodel.ProfileGallerySixVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGallerySixActivity :
    BaseActivity<ActivityProfileGallerySixBinding>(R.layout.activity_profile_gallery_six) {
  private val viewModel: ProfileGallerySixVM by viewModels<ProfileGallerySixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered19RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGallerySixVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered19RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_SIX_ACTIVITY"

  }
}
