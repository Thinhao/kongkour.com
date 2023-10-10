package com.chhurngsapplication.app.modules.profilegalleryeighteen.ui

import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityProfileGalleryEighteenBinding
import com.chhurngsapplication.app.modules.kayvey.ui.KayveyActivity
import com.chhurngsapplication.app.modules.profilegalleryeighteen.`data`.model.Staggered11RowModel
import com.chhurngsapplication.app.modules.profilegalleryeighteen.`data`.viewmodel.ProfileGalleryEighteenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileGalleryEighteenActivity :
    BaseActivity<ActivityProfileGalleryEighteenBinding>(R.layout.activity_profile_gallery_eighteen)
    {
  private val viewModel: ProfileGalleryEighteenVM by viewModels<ProfileGalleryEighteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredAdapter = StaggeredAdapter(viewModel.staggeredList.value?:mutableListOf())
    binding.recyclerStaggered.adapter = staggeredAdapter
    staggeredAdapter.setOnItemClickListener(
    object : StaggeredAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Staggered11RowModel) {
        onClickRecyclerStaggered(view, position, item)
      }
    }
    )
    viewModel.staggeredList.observe(this) {
      staggeredAdapter.updateData(it)
    }
    binding.profileGalleryEighteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnrectanglethree.setOnClickListener {
      val destIntent = KayveyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggered(
    view: View,
    position: Int,
    item: Staggered11RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_GALLERY_EIGHTEEN_ACTIVITY"

  }
}
