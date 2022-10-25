package com.example.kotlin5recyclerviewproject.ui.mainrecycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlin5recyclerviewproject.databinding.FragmentMainRecyclerBinding
import com.example.kotlin5recyclerviewproject.ui.mainrecycler.mainrecyclerviewmodel.FilmAdapter
import com.example.kotlin5recyclerviewproject.ui.data.FilmModel
import com.example.kotlin5recyclerviewproject.ui.mainrecycler.mainrecyclerviewmodel.MainRecyclerVewModel


class MainRecyclerFragment : Fragment() {

    private lateinit var binding: FragmentMainRecyclerBinding
    private var viewModel: MainRecyclerVewModel? = null
    private val list: ArrayList<FilmModel> = ArrayList()
    private val filmAdapter = FilmAdapter(list)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainRecyclerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MainRecyclerVewModel::class.java]

        initializeRecycler()
        setviewModel()
        getData()
        getText()

    }

    private fun setviewModel() {
        binding.btnFilm.setOnClickListener {
            changingButtons()
            binding.viewRecView.visibility = View.VISIBLE
            viewModel?.getEndFilmList()
        }
    }

    private fun initializeRecycler() {
        binding.viewRecView.layoutManager = LinearLayoutManager(requireContext())
        binding.viewRecView.adapter = filmAdapter
    }

    private fun getData() {
        viewModel?.data?.observe(viewLifecycleOwner) {
            list.addAll(it)
            filmAdapter.notifyDataSetChanged()
        }
    }

    private fun changingButtons() {
        binding.btnFilm.visibility = View.GONE
    }

    private fun getText() {

    }

}





