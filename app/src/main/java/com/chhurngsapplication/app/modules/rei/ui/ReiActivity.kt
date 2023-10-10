package com.chhurngsapplication.app.modules.rei.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityReiBinding
import com.chhurngsapplication.app.modules.rei.`data`.model.ReiRowModel
import com.chhurngsapplication.app.modules.rei.`data`.viewmodel.ReiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReiActivity : BaseActivity<ActivityReiBinding>(R.layout.activity_rei) {
  private val viewModel: ReiVM by viewModels<ReiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val reiAdapter = ReiAdapter(viewModel.reiList.value?:mutableListOf())
    binding.recyclerRei.adapter = reiAdapter
    reiAdapter.setOnItemClickListener(
    object : ReiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ReiRowModel) {
        onClickRecyclerRei(view, position, item)
      }
    }
    )
    viewModel.reiList.observe(this) {
      reiAdapter.updateData(it)
    }
    binding.reiVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerRei(
    view: View,
    position: Int,
    item: ReiRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REI_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReiActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
