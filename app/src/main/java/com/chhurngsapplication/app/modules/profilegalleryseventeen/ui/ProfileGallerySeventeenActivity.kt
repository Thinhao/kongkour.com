package com.chhurngsapplication.app.modules.profilegalleryseventeen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGallerySeventeenBinding
import com.chhurngsapplication.app.modules.profilegalleryseventeen.`data`.model.Staggered16RowModel
import com.chhurngsapplication.app.modules.profilegalleryseventeen.`data`.viewmodel.ProfileGallerySeventeenVM
import com.chhurngsapplication.app.modules.reione.ui.ReiOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGallerySeventeenActivity :
    BaseActivity<ActivityProfileGallerySeventeenBinding>(R.layout.activity_profile_gallery_seventeen)
    {
  private val viewModel: ProfileGallerySeventeenVM by viewModels<ProfileGallerySeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered16RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGallerySeventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = ReiOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered16RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_SEVENTEEN_ACTIVITY"

  }
}
