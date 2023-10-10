package com.chhurngsapplication.app.modules.layhouyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityLayhouyOneBinding
import com.chhurngsapplication.app.modules.layhouyone.`data`.model.LayhouyOneRowModel
import com.chhurngsapplication.app.modules.layhouyone.`data`.viewmodel.LayhouyOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LayhouyOneActivity : BaseActivity<ActivityLayhouyOneBinding>(R.layout.activity_layhouy_one) {
  private val viewModel: LayhouyOneVM by viewModels<LayhouyOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val layhouyOneAdapter = LayhouyOneAdapter(viewModel.layhouyOneList.value?:mutableListOf())
    binding.recyclerLayhouyOne.adapter = layhouyOneAdapter
    layhouyOneAdapter.setOnItemClickListener(
    object : LayhouyOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LayhouyOneRowModel) {
        onClickRecyclerLayhouyOne(view, position, item)
      }
    }
    )
    viewModel.layhouyOneList.observe(this) {
      layhouyOneAdapter.updateData(it)
    }
    binding.layhouyOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLayhouyOne(
    view: View,
    position: Int,
    item: LayhouyOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LAYHOUY_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LayhouyOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
