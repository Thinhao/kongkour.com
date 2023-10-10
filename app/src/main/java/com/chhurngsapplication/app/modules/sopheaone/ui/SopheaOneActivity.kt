package com.chhurngsapplication.app.modules.sopheaone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivitySopheaOneBinding
import com.chhurngsapplication.app.modules.sopheaone.`data`.model.SopheaOneRowModel
import com.chhurngsapplication.app.modules.sopheaone.`data`.viewmodel.SopheaOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SopheaOneActivity : BaseActivity<ActivitySopheaOneBinding>(R.layout.activity_sophea_one) {
  private val viewModel: SopheaOneVM by viewModels<SopheaOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sopheaOneAdapter = SopheaOneAdapter(viewModel.sopheaOneList.value?:mutableListOf())
    binding.recyclerSopheaOne.adapter = sopheaOneAdapter
    sopheaOneAdapter.setOnItemClickListener(
    object : SopheaOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SopheaOneRowModel) {
        onClickRecyclerSopheaOne(view, position, item)
      }
    }
    )
    viewModel.sopheaOneList.observe(this) {
      sopheaOneAdapter.updateData(it)
    }
    binding.sopheaOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSopheaOne(
    view: View,
    position: Int,
    item: SopheaOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SOPHEA_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SopheaOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
