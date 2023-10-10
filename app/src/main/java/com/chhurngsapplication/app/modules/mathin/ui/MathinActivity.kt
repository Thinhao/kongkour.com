package com.chhurngsapplication.app.modules.mathin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityMathinBinding
import com.chhurngsapplication.app.modules.mathin.`data`.model.MathinRowModel
import com.chhurngsapplication.app.modules.mathin.`data`.viewmodel.MathinVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MathinActivity : BaseActivity<ActivityMathinBinding>(R.layout.activity_mathin) {
  private val viewModel: MathinVM by viewModels<MathinVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mathinAdapter = MathinAdapter(viewModel.mathinList.value?:mutableListOf())
    binding.recyclerMathin.adapter = mathinAdapter
    mathinAdapter.setOnItemClickListener(
    object : MathinAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MathinRowModel) {
        onClickRecyclerMathin(view, position, item)
      }
    }
    )
    viewModel.mathinList.observe(this) {
      mathinAdapter.updateData(it)
    }
    binding.mathinVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMathin(
    view: View,
    position: Int,
    item: MathinRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MATHIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MathinActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
