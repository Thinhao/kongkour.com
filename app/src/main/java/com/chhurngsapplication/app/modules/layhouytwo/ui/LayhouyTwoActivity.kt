package com.chhurngsapplication.app.modules.layhouytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLayhouyTwoBinding
import com.chhurngsapplication.app.modules.layhouytwo.`data`.model.LayhouyTwoRowModel
import com.chhurngsapplication.app.modules.layhouytwo.`data`.viewmodel.LayhouyTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LayhouyTwoActivity : BaseActivity<ActivityLayhouyTwoBinding>(R.layout.activity_layhouy_two) {
  private val viewModel: LayhouyTwoVM by viewModels<LayhouyTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val layhouyTwoAdapter = LayhouyTwoAdapter(viewModel.layhouyTwoList.value?:mutableListOf())
    binding.recyclerLayhouyTwo.adapter = layhouyTwoAdapter
    layhouyTwoAdapter.setOnItemClickListener(
    object : LayhouyTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LayhouyTwoRowModel) {
        onClickRecyclerLayhouyTwo(view, position, item)
      }
    }
    )
    viewModel.layhouyTwoList.observe(this) {
      layhouyTwoAdapter.updateData(it)
    }
    binding.layhouyTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLayhouyTwo(
    view: View,
    position: Int,
    item: LayhouyTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LAYHOUY_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LayhouyTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
