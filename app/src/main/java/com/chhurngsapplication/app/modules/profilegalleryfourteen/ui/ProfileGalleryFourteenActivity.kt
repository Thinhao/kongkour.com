package com.chhurngsapplication.app.modules.profilegalleryfourteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryFourteenBinding
import com.chhurngsapplication.app.modules.profilegalleryfourteen.`data`.model.Staggered3RowModel
import com.chhurngsapplication.app.modules.profilegalleryfourteen.`data`.viewmodel.ProfileGalleryFourteenVM
import com.chhurngsapplication.app.modules.sopheaone.ui.SopheaOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryFourteenActivity :
    BaseActivity<ActivityProfileGalleryFourteenBinding>(R.layout.activity_profile_gallery_fourteen)
    {
  private val viewModel: ProfileGalleryFourteenVM by viewModels<ProfileGalleryFourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered3RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryFourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = SopheaOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_FOURTEEN_ACTIVITY"

  }
}
