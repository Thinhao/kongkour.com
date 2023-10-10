package com.chhurngsapplication.app.modules.nathan.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityNathanBinding
import com.chhurngsapplication.app.modules.nathan.`data`.model.NathanRowModel
import com.chhurngsapplication.app.modules.nathan.`data`.viewmodel.NathanVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NathanActivity : BaseActivity<ActivityNathanBinding>(R.layout.activity_nathan) {
  private val viewModel: NathanVM by viewModels<NathanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val nathanAdapter = NathanAdapter(viewModel.nathanList.value?:mutableListOf())
    binding.recyclerNathan.adapter = nathanAdapter
    nathanAdapter.setOnItemClickListener(
    object : NathanAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NathanRowModel) {
        onClickRecyclerNathan(view, position, item)
      }
    }
    )
    viewModel.nathanList.observe(this) {
      nathanAdapter.updateData(it)
    }
    binding.nathanVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerNathan(
    view: View,
    position: Int,
    item: NathanRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NATHAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NathanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
