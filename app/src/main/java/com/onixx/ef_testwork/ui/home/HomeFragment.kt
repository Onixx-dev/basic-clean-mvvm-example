package com.onixx.ef_testwork.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.onixx.ef_testwork.R
import com.onixx.ef_testwork.R.*
import com.onixx.ef_testwork.databinding.FragmentHomeBinding
import com.onixx.ef_testwork.ui.bottomSheet.BottomSheetFragment
import org.koin.androidx.viewmodel.ext.android.viewModel


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!



    private val homeViewModel by viewModel<HomeViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.
//        homeViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        homeViewModel.offers.observe(viewLifecycleOwner) {
            val recyclerView: RecyclerView = requireView().findViewById(com.onixx.ef_testwork.R.id.recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            recyclerView.adapter = HomeAdapter(homeViewModel.offers.value!!.offers)
        }

        homeViewModel.ticketOffers.observe(viewLifecycleOwner) {
            Log.d("live data example",  "get list of ticket_offers = ${it.ticketsOffers}")
        }

        homeViewModel.tickets.observe(viewLifecycleOwner) {
            Log.d("coroutines example",  "get list of tickets = ${it.tickets}")
        }

        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.getMainMenu()

        val fromField: TextView = requireView().findViewById(R.id.from_field)
        val toField: TextView = requireView().findViewById(R.id.to_field)

        toField.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus)
            {
                Log.d("sheet",  "click")
                val bottomSheetFragment: BottomSheetDialogFragment = BottomSheetFragment()
                bottomSheetFragment.show( childFragmentManager, bottomSheetFragment.tag)
            }
        }



//        val button1: Button = view.findViewById(R.id.button1)
//        val button2: Button = view.findViewById(R.id.button2)
//        val button3: Button = view.findViewById(R.id.button3)
//
//        button1.setOnClickListener { homeViewModel.getMainMenu() }
//
//        button2.setOnClickListener {homeViewModel.focusedOnCountryField()}
//
//        button3.setOnClickListener  {homeViewModel.countrySelected()}
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}