package com.chhurngsapplication.app.modules.profilegalleryfifteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryFifteenBinding
import com.chhurngsapplication.app.modules.layhouythree.ui.LayhouyThreeActivity
import com.chhurngsapplication.app.modules.profilegalleryfifteen.`data`.model.Staggered9RowModel
import com.chhurngsapplication.app.modules.profilegalleryfifteen.`data`.viewmodel.ProfileGalleryFifteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryFifteenActivity :
    BaseActivity<ActivityProfileGalleryFifteenBinding>(R.layout.activity_profile_gallery_fifteen) {
  private val viewModel: ProfileGalleryFifteenVM by viewModels<ProfileGalleryFifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered9RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryFifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = LayhouyThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered9RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_FIFTEEN_ACTIVITY"

  }
}
