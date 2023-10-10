package com.chhurngsapplication.app.modules.thea.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivityTheaBinding
import com.chhurngsapplication.app.modules.thea.`data`.model.TheaRowModel
import com.chhurngsapplication.app.modules.thea.`data`.viewmodel.TheaVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TheaActivity : BaseActivity<ActivityTheaBinding>(R.layout.activity_thea) {
  private val viewModel: TheaVM by viewModels<TheaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val theaAdapter = TheaAdapter(viewModel.theaList.value?:mutableListOf())
    binding.recyclerThea.adapter = theaAdapter
    theaAdapter.setOnItemClickListener(
    object : TheaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TheaRowModel) {
        onClickRecyclerThea(view, position, item)
      }
    }
    )
    viewModel.theaList.observe(this) {
      theaAdapter.updateData(it)
    }
    binding.theaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerThea(
    view: View,
    position: Int,
    item: TheaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "THEA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TheaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
