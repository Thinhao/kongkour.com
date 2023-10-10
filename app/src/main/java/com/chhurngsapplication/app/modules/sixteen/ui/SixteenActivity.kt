package com.chhurngsapplication.app.modules.sixteen.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.chhurngsapplication.app.R
import com.chhurngsapplication.app.appcomponents.base.BaseActivity
import com.chhurngsapplication.app.databinding.ActivitySixteenBinding
import com.chhurngsapplication.app.modules.coursedetail.ui.CoursedetailActivity
import com.chhurngsapplication.app.modules.coursedetailfive.ui.CoursedetailFiveActivity
import com.chhurngsapplication.app.modules.coursedetailthree.ui.CoursedetailThreeActivity
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ImageSliderSliderlanguageModel
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ListplaceholderFive1RowModel
import com.chhurngsapplication.app.modules.sixteen.`data`.model.ListplaceholderFour1RowModel
import com.chhurngsapplication.app.modules.sixteen.`data`.viewmodel.SixteenVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class SixteenActivity : BaseActivity<ActivitySixteenBinding>(R.layout.activity_sixteen) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.chhurngsapplication.app/drawable/img_star_white_a700")


  private val imageSliderSliderlanguageItems: ArrayList<ImageSliderSliderlanguageModel> =
      arrayListOf(ImageSliderSliderlanguageModel(imageStar =
  imageUri.toString()),ImageSliderSliderlanguageModel(imageStar = imageUri.toString()))


  private val viewModel: SixteenVM by viewModels<SixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderlanguageAdapter = SliderlanguageAdapter(imageSliderSliderlanguageItems,true)
    binding.imageSliderSliderlanguage.adapter = sliderlanguageAdapter
    val listplaceholderFourAdapter =
    ListplaceholderFourAdapter(viewModel.listplaceholderFourList.value?:mutableListOf())
    binding.recyclerListplaceholderFour.adapter = listplaceholderFourAdapter
    listplaceholderFourAdapter.setOnItemClickListener(
    object : ListplaceholderFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListplaceholderFour1RowModel) {
        onClickRecyclerListplaceholderFour(view, position, item)
      }
    }
    )
    viewModel.listplaceholderFourList.observe(this) {
      listplaceholderFourAdapter.updateData(it)
    }
    val listplaceholderFiveAdapter =
    ListplaceholderFiveAdapter(viewModel.listplaceholderFiveList.value?:mutableListOf())
    binding.recyclerListplaceholderFive.adapter = listplaceholderFiveAdapter
    listplaceholderFiveAdapter.setOnItemClickListener(
    object : ListplaceholderFiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListplaceholderFive1RowModel) {
        onClickRecyclerListplaceholderFive(view, position, item)
      }
    }
    )
    viewModel.listplaceholderFiveList.observe(this) {
      listplaceholderFiveAdapter.updateData(it)
    }
    binding.sixteenVM = viewModel
    setUpSearchViewSearchBarListener()
    setUpSearchViewSearchListener()
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderlanguage.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderlanguage.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListplaceholderFour(
    view: View,
    position: Int,
    item: ListplaceholderFour1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnplaceholderFour -> {
        onClickRecyclerListplaceholderFourLinearColumnplaceholderFour(view, position, item)
      }
    }
  }

  fun onClickRecyclerListplaceholderFive(
    view: View,
    position: Int,
    item: ListplaceholderFive1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    private fun setUpSearchViewSearchListener(): Unit {
      binding.searchViewSearch.setOnQueryTextListener(object :
      SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(p0 : String) : Boolean {
          // Performs search when user hit
          // the search button on the keyboard
          return false
        }
        override fun onQueryTextChange(p0 : String) : Boolean {
          // Start filtering the list as user
          // start entering the characters
          return false
        }
        })
      }

      fun onClickRecyclerListplaceholderFourLinearColumnplaceholderFour(
        view: View,
        position: Int,
        item: ListplaceholderFour1RowModel
      ): Unit {
        /** TODO As per your logic, Add constant type for item click.*/
        when(0) {
          0 -> {
            val destIntent = CoursedetailFiveActivity.getIntent(this, null)
            startActivity(destIntent)
          }
          1 -> {
            val destIntent = CoursedetailThreeActivity.getIntent(this, null)
            startActivity(destIntent)
          }
          2 -> {
            val destIntent = CoursedetailActivity.getIntent(this, null)
            startActivity(destIntent)
          }
        }
      }

      companion object {
        const val TAG: String = "SIXTEEN_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SixteenActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
