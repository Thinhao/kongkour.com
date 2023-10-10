package com.chhurngsapplication.app.modules.nathanone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityNathanOneBinding
import com.chhurngsapplication.app.modules.nathanone.`data`.model.NathanOneRowModel
import com.chhurngsapplication.app.modules.nathanone.`data`.viewmodel.NathanOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NathanOneActivity : BaseActivity<ActivityNathanOneBinding>(R.layout.activity_nathan_one) {
  private val viewModel: NathanOneVM by viewModels<NathanOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val nathanOneAdapter = NathanOneAdapter(viewModel.nathanOneList.value?:mutableListOf())
    binding.recyclerNathanOne.adapter = nathanOneAdapter
    nathanOneAdapter.setOnItemClickListener(
    object : NathanOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NathanOneRowModel) {
        onClickRecyclerNathanOne(view, position, item)
      }
    }
    )
    viewModel.nathanOneList.observe(this) {
      nathanOneAdapter.updateData(it)
    }
    binding.nathanOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerNathanOne(
    view: View,
    position: Int,
    item: NathanOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NATHAN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NathanOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
