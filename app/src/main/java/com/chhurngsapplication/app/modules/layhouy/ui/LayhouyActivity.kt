package com.chhurngsapplication.app.modules.layhouy.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLayhouyBinding
import com.chhurngsapplication.app.modules.layhouy.`data`.model.LayhouyRowModel
import com.chhurngsapplication.app.modules.layhouy.`data`.viewmodel.LayhouyVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LayhouyActivity : BaseActivity<ActivityLayhouyBinding>(R.layout.activity_layhouy) {
  private val viewModel: LayhouyVM by viewModels<LayhouyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val layhouyAdapter = LayhouyAdapter(viewModel.layhouyList.value?:mutableListOf())
    binding.recyclerLayhouy.adapter = layhouyAdapter
    layhouyAdapter.setOnItemClickListener(
    object : LayhouyAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LayhouyRowModel) {
        onClickRecyclerLayhouy(view, position, item)
      }
    }
    )
    viewModel.layhouyList.observe(this) {
      layhouyAdapter.updateData(it)
    }
    binding.layhouyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLayhouy(
    view: View,
    position: Int,
    item: LayhouyRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LAYHOUY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LayhouyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
