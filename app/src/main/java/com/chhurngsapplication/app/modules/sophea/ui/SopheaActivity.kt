package com.chhurngsapplication.app.modules.sophea.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivitySopheaBinding
import com.chhurngsapplication.app.modules.sophea.`data`.model.SopheaRowModel
import com.chhurngsapplication.app.modules.sophea.`data`.viewmodel.SopheaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SopheaActivity : BaseActivity<ActivitySopheaBinding>(R.layout.activity_sophea) {
  private val viewModel: SopheaVM by viewModels<SopheaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sopheaAdapter = SopheaAdapter(viewModel.sopheaList.value?:mutableListOf())
    binding.recyclerSophea.adapter = sopheaAdapter
    sopheaAdapter.setOnItemClickListener(
    object : SopheaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SopheaRowModel) {
        onClickRecyclerSophea(view, position, item)
      }
    }
    )
    viewModel.sopheaList.observe(this) {
      sopheaAdapter.updateData(it)
    }
    binding.sopheaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSophea(
    view: View,
    position: Int,
    item: SopheaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SOPHEA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SopheaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
