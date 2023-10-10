package com.chhurngsapplication.app.modules.profilegallerysixteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGallerySixteenBinding
import com.chhurngsapplication.app.modules.mathinone.ui.MathinOneActivity
import com.chhurngsapplication.app.modules.profilegallerysixteen.`data`.model.Staggered12RowModel
import com.chhurngsapplication.app.modules.profilegallerysixteen.`data`.viewmodel.ProfileGallerySixteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGallerySixteenActivity :
    BaseActivity<ActivityProfileGallerySixteenBinding>(R.layout.activity_profile_gallery_sixteen) {
  private val viewModel: ProfileGallerySixteenVM by viewModels<ProfileGallerySixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered12RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGallerySixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = MathinOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered12RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_SIXTEEN_ACTIVITY"

  }
}
