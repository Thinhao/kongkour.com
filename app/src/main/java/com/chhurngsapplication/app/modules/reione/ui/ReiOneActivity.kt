package com.chhurngsapplication.app.modules.reione.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityReiOneBinding
import com.chhurngsapplication.app.modules.reione.`data`.model.ReiOneRowModel
import com.chhurngsapplication.app.modules.reione.`data`.viewmodel.ReiOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReiOneActivity : BaseActivity<ActivityReiOneBinding>(R.layout.activity_rei_one) {
  private val viewModel: ReiOneVM by viewModels<ReiOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val reiOneAdapter = ReiOneAdapter(viewModel.reiOneList.value?:mutableListOf())
    binding.recyclerReiOne.adapter = reiOneAdapter
    reiOneAdapter.setOnItemClickListener(
    object : ReiOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ReiOneRowModel) {
        onClickRecyclerReiOne(view, position, item)
      }
    }
    )
    viewModel.reiOneList.observe(this) {
      reiOneAdapter.updateData(it)
    }
    binding.reiOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerReiOne(
    view: View,
    position: Int,
    item: ReiOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REI_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReiOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
