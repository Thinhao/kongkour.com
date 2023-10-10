package com.chhurngsapplication.app.modules.profilegallerynineteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryNineteenBinding
import com.chhurngsapplication.app.modules.profilegallerynineteen.`data`.model.Staggered4RowModel
import com.chhurngsapplication.app.modules.profilegallerynineteen.`data`.viewmodel.ProfileGalleryNineteenVM
import com.chhurngsapplication.app.modules.rei.ui.ReiActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryNineteenActivity :
    BaseActivity<ActivityProfileGalleryNineteenBinding>(R.layout.activity_profile_gallery_nineteen)
    {
  private val viewModel: ProfileGalleryNineteenVM by viewModels<ProfileGalleryNineteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered4RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryNineteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = ReiActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_NINETEEN_ACTIVITY"

  }
}
