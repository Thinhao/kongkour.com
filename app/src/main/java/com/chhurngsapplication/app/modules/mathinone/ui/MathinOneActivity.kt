package com.chhurngsapplication.app.modules.mathinone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityMathinOneBinding
import com.chhurngsapplication.app.modules.mathinone.`data`.model.MathinOneRowModel
import com.chhurngsapplication.app.modules.mathinone.`data`.viewmodel.MathinOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MathinOneActivity : BaseActivity<ActivityMathinOneBinding>(R.layout.activity_mathin_one) {
  private val viewModel: MathinOneVM by viewModels<MathinOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mathinOneAdapter = MathinOneAdapter(viewModel.mathinOneList.value?:mutableListOf())
    binding.recyclerMathinOne.adapter = mathinOneAdapter
    mathinOneAdapter.setOnItemClickListener(
    object : MathinOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MathinOneRowModel) {
        onClickRecyclerMathinOne(view, position, item)
      }
    }
    )
    viewModel.mathinOneList.observe(this) {
      mathinOneAdapter.updateData(it)
    }
    binding.mathinOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMathinOne(
    view: View,
    position: Int,
    item: MathinOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MATHIN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MathinOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
