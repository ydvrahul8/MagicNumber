package com.magicnumber.pm_utils.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * Created by Rahul Yadav on 27-09-2021.
 */
open class BaseFragment<T : ViewDataBinding>(@LayoutRes private val layoutResourceId: Int) : Fragment() {

    private var _binding: T? = null
    val binding: T get() = _binding!!

    open fun T.initialize() {}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //inflate the view
        _binding = DataBindingUtil.inflate(inflater, layoutResourceId, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.initialize()
    }

    //Removing the binding reference when not needed is recommended as it avoids memory leaks
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}