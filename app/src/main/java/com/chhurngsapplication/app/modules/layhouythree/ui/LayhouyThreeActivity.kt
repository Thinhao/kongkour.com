package com.chhurngsapplication.app.modules.layhouythree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLayhouyThreeBinding
import com.chhurngsapplication.app.modules.layhouythree.`data`.model.LayhouyThreeRowModel
import com.chhurngsapplication.app.modules.layhouythree.`data`.viewmodel.LayhouyThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LayhouyThreeActivity :
    BaseActivity<ActivityLayhouyThreeBinding>(R.layout.activity_layhouy_three) {
  private val viewModel: LayhouyThreeVM by viewModels<LayhouyThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val layhouyThreeAdapter =
    LayhouyThreeAdapter(viewModel.layhouyThreeList.value?:mutableListOf())
    binding.recyclerLayhouyThree.adapter = layhouyThreeAdapter
    layhouyThreeAdapter.setOnItemClickListener(
    object : LayhouyThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LayhouyThreeRowModel) {
        onClickRecyclerLayhouyThree(view, position, item)
      }
    }
    )
    viewModel.layhouyThreeList.observe(this) {
      layhouyThreeAdapter.updateData(it)
    }
    binding.layhouyThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLayhouyThree(
    view: View,
    position: Int,
    item: LayhouyThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LAYHOUY_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LayhouyThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
